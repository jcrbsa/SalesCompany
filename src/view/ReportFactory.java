/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author bruno.andrade
 */
public class ReportFactory {

    public Report getReport(String type, String style) {
        if ("sales".equals(type)) {
            return SalesReportFactory.getSalesReport(style);
        }else{
        return null;
        }
    }
}
