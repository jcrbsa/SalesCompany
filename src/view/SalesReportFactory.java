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
public class SalesReportFactory {
        public static Report getSalesReport(String style){
            
            if("PDF".equals(style)){
                return new PDFSalesReport();
            }else if("SWING".equals(style)){
                return new SWINGSalesReport();
            }else
                return null;
        }
}
