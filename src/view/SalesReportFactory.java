/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.List;
import swing.visualizar.SWINGSalesReport;

/**
 *
 * @author bruno.andrade
 */
public class SalesReportFactory {

    public Report getSalesReport(String style, List orders) {

        if ("PDF".equals(style)) {
            return new PDFSalesReport(orders);
        } else if ("SWING".equals(style)) {
            return new SWINGSalesReport(orders);
        } else {
            return null;
        }
    }
}
