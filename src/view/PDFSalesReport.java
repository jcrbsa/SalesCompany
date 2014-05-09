/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.Order;
import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.OrderItem;
import java.util.List;

/**
 *
 * @author bruno.andrade
 */
public class PDFSalesReport extends Report {

    List<Order> generics;

    public PDFSalesReport(List paramGenerics) {
        this.generics = paramGenerics;
    }

    @Override
    public void printSalesCheckout() {
//         Document document = new Document(PageSize.A4);
//        // step 2
//        PdfWriter.getInstance(document, new FileOutputStream(RESULT));
        // step 3
       // document.open();
        // step 4
        
        // step 5
           
//        for (Order order : generics) {
//            document.add(new Paragraph(order.getNumber() + ":" + order.getCustomer().getName() " - "
//            + order.getCustomer().getAddress()+ "Total:" +  order.getTotalOrderPayment()));
//            
//            
//                    for (OrderItem item : order.getItems()) {
//                    
//                  document.add(new Paragraph("Produtos: /n" + item.getProduct().getName() 
//                          + "Qt:" item.getQuantity()));
//            }
//                   document.add(new Paragraph(order.getSumPriceItems()));
//                   document.add(new Paragraph("-----------------------------"));
//                   
//                    
//        }
  //       document.close();
    
    }

    @Override
    public void getKind() {
        System.out.println("Type is PDF");
    }
}
