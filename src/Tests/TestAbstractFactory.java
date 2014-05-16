/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tests;

import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.Order;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import view.Report;
import view.ReportFactory;

/**
 *
 * @author bruno.andrade
 */
public class TestAbstractFactory {
    private List<Order> listOrdersCheckout;
    private   Report report = null;

    public TestAbstractFactory() {
        listOrdersCheckout = new ArrayList<Order>();
        listOrdersCheckout.add(new Order(1));
        listOrdersCheckout.add(new Order(2));
        listOrdersCheckout.add(new Order(3));
        listOrdersCheckout.add(new Order(4));
    }
    
    public void  test(){
          report = new ReportFactory().getSalesReport("SWING", listOrdersCheckout);
          
                    report.getKind();
                    report.printSalesCheckout();
        
    }
    
    public static void main(String[] args) {
       
      
           new TestAbstractFactory().test();
     
            //report = new ReportFactory().getReport("sales", "PDF", listOrdersCheckout);
            
        
    }
    
}
