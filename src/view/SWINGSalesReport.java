/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.Order;
import java.util.List;
import swing.visualizar.SWINGSalesReport2;

/**
 *
 * @author bruno.andrade
 */
public class SWINGSalesReport extends Report{
    
    List<Order> generics;

    public SWINGSalesReport(List<Order> paramGenerics) {
        this.generics = paramGenerics;
    }

    @Override
    public void printSalesCheckout() {
        for (Order order : generics) {

            System.out.println(order.getNumber());
        }
        
        SWINGSalesReport2 s = new SWINGSalesReport2(generics);
        s.show();
    }

    @Override
    public void getKind() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
