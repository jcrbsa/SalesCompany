/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.Order;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import swing.visualizar.SwingSalesReportView;

/**
 *
 * @author bruno.andrade
 */
public class SwingSalesReport extends Report{
    
      List<Order> generics;

    public SwingSalesReport(List<Order> paramGenerics) {
        this.generics = paramGenerics;
    }

    @Override
    public void printSalesCheckout() {
        for (Order order : generics) {

            System.out.println(order.getNumber());
        }
        
        SwingSalesReportView s = new SwingSalesReportView(generics);
        s.show();
    }

    @Override
    public void getKind() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
