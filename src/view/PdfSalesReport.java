/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.Order;
import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.OrderItem;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bruno.andrade
 */
public class PdfSalesReport extends Report {

    List<Order> generics;

    public PdfSalesReport(List paramGenerics) {
        this.generics = paramGenerics;
    }

    @Override
    public void printSalesCheckout() {
        Document document = new Document(PageSize.A4);
        try {
            PdfWriter.getInstance(document, new FileOutputStream("C:\\SalesReport.pdf"));

            document.open();


            for (Order order : generics) {

                document.add(new Paragraph("================================= Order ================================="));
                document.add(new Paragraph(
                        "Nº Order: " + (order.getNumber() + 1) + " Name Customer: " + order.getCustomer().getName()
                        + " Address: " + order.getCustomer().getAddress() + " Total Payment:" + order.getTotalOrderPayment()));

                document.add(new Paragraph("--------------------------------- OrderItems --------------------------------- "));
                for (OrderItem item : order.getItems()) {

                    document.add(new Paragraph("Products: " + item.getProduct().getName()
                            + " Qt: "
                            + item.getQuantity()));
                }
                document.add(new Paragraph("Sum Price Products: " + order.getSumPriceItems()));
                document.add(new Paragraph("-------------------------------------------------------------------------"));

                document.add(new Paragraph("========================================================================="));

            }
            document.close();


        } catch (FileNotFoundException ex) {
            Logger.getLogger(PdfSalesReport.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(PdfSalesReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void getKind() {
        System.out.println("Type is PDF");
    }
}
