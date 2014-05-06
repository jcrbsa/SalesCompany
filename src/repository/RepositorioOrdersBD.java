package br.edu.ifpe.tads.lpoo2.grasp.parte3.repository;

import br.edu.ifpe.tads.lpoo2.grasp.parte3.utils.DAO;
import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.OrderItem;
import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.Order;
import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.Product;
import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.Shipping;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RepositorioOrdersBD implements RepositorioOrders {

	private Connection con;
	private String sql;
	private Order order;
	private List<Order> listaCandidato;

	@Override
	public boolean insertOrder(Order order) {

		sql = "INSERT INTO ORDER(namecustomer,deliverytime,priceperkg, nameproduct, price, weight, quantidade) VALUES(?,?,?,?,?,?,?,?)";
		try {
			for (OrderItem item : order.getItems()) {
				con = new DAO().getConexao();

				PreparedStatement stmt = con.prepareStatement(sql);
				int count = 1;
				stmt.setString(count++, order.getCustomer().getName());
				stmt.setInt(count++, order.getShipping().getDeliveryTime());
				stmt.setDouble(count++, order.getShipping().getPricePerKg());
				stmt.setString(count++, item.getProduct().getName());
				stmt.setBoolean(count++, item.getProduct().getPerecivel());
				stmt.setDouble(count++, item.getProduct().getPrice());
				stmt.setDouble(count++, item.getProduct().getWeight());
				stmt.setInt(count++, item.getQuantity());

				stmt.executeUpdate();
				stmt.close();
			}

		} catch (ClassNotFoundException ex) {
		} catch (SQLException ex) {
		} finally {
			try {
				con.close();
			} catch (SQLException ex) {
			}
		}

		return false;
	}

	@Override
	public boolean updateOrder(int id, Order order) {
		sql = "update Order set namecustomer = ?,deliverytime ?,priceperkg = ? where = id ?";
		try {
		
				con = new DAO().getConexao();

				PreparedStatement stmt = con.prepareStatement(sql);
				int count = 1;
				stmt.setString(count++, order.getCustomer().getName());
				stmt.setInt(count++, order.getShipping().getDeliveryTime());
				stmt.setDouble(count++, order.getShipping().getPricePerKg());
				stmt.setInt(count++, order.getNumber());


				stmt.executeUpdate();
				stmt.close();
			
		} catch (ClassNotFoundException ex) {
		} catch (SQLException ex) {
		} finally {
			try {
				con.close();
			} catch (SQLException ex) {
			}
		}

		return false;
	}

	@Override
	public boolean deleteOrder(int id) {
		sql = "delete from Order where id = ?";
		try {
		
				con = new DAO().getConexao();

				PreparedStatement stmt = con.prepareStatement(sql);
				int count = 1;
			
				stmt.setInt(count++, id);


				stmt.executeUpdate();
				stmt.close();
			
		} catch (ClassNotFoundException ex) {
		} catch (SQLException ex) {
		} finally {
			try {
				con.close();
			} catch (SQLException ex) {
			}
		}

		return false;
	}

	@Override
	public Order selectOrder(int id) {
List<Order> Order = new ArrayList<Order>();
try {	
		con = new DAO().getConexao();
		sql = "select * from Order where id = ?";
		PreparedStatement stmt = con.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		int ct = 0;
		   while(rs.next()){
		      Order pedido = new Order(rs.getInt("id"));
		      
		      
		      pedido.getItems().get(ct).setProduct(new Product(rs.getString("nameproduct"),rs.getDouble("price"),rs.getDouble("weight")));
		  
		      
		      Order.add(pedido);
		      
		      ct++;
		   }
		   

		   
		   rs.close();
		   stmt.close();
		

	} catch (ClassNotFoundException ex) {
	} catch (SQLException ex) {
	} finally {
		try {
			con.close();
		} catch (SQLException ex) {
		}
	}
	return null;
}

	@Override
	public List<Order> selectOrders() {
		return null;
	}

}
