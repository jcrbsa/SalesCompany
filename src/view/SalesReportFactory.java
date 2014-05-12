/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.List;
import swing.visualizar.SwingSalesReportView;

/**
 *
 * @author bruno.andrade
 */
public class SalesReportFactory {

    public Report getSalesReport(String style, List orders) {

        if ("pdf".equals(style)) {
            return new PdfSalesReport(orders);
        } else if ("swing".equals(style)) {
            return new SwingSalesReport(orders);
        } else {
            return null;
        }
    }
}
