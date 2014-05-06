/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.Customer;
import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jcrbsa
 */
public class RepositorioCustomerList implements RepositorioCustomer {
    
	private static int id=0;
	private static List<Customer> customers = new ArrayList<Customer>();
	
        @Override
	public boolean insertCustomer(Customer customer) {
	
		try{
		customers.add(customer);
               id++;
		return true;
		}catch(Exception e){
			e.printStackTrace();
			
		}
		return false;
	
	}

	@Override
	public boolean updateCustomer(int id, Customer customer) {
		
		try{
		customers.set(id, customer);
		return true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteCustomer(int id) {
		try{
			customers.remove(id);
			id--;
			return true;
		}catch (Exception e){
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public Customer selectCustomer(int id) {
		try{
			
			return customers.get(id);
		}catch(Exception e){
			e.printStackTrace();
			
		}
		return null;
	}

	@Override
	public List<Customer> listCustomers() {
		
		return customers;
	}

    
    
}
