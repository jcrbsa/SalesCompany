/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.Order;
import java.util.List;
import swing.visualizar.SwingSalesReportView;

/**
 *
 * @author bruno.andrade
 */
public class ReportFactory {

//    public Report getReport(String type, String style, List<Order> ordersCheckouts) {
//        if ("sales".equals(type)) {
//            return new SalesReportFactory().getSalesReport(style, ordersCheckouts);
//        } else {
//            return null;
//        }
//    }
    
     public Report getSalesReport(String style, List orders) {

        if ("pdf".equals(style)) {
            return new PdfSalesReport(orders);
        } else if ("swing".equals(style)) {
            return new SwingSalesReport(orders);
        } else {
            return null;
        }
    }

   // public abstract Report getSalesReport(String style, List orders);
}
