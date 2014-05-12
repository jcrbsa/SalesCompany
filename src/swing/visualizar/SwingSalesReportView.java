/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.visualizar;

import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.CreditCard;
import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.Order;
import br.edu.ifpe.tads.lpoo2.grasp.parte3.subsystem.Shipping;
import fachada.FachadaOrders;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import view.Report;

/**
 *
 * @author bruno.andrade
 */
public class SwingSalesReportView extends javax.swing.JFrame {

    /**
     * Creates new form FormConsultaVendaCheckout
     */
    public SwingSalesReportView() {
        initComponents();
        centralizeFrame();
    }
    List<Order> generics;

    public SwingSalesReportView(List<Order> paramGenerics) {
    initComponents();
        centralizeFrame();
        this.generics = paramGenerics;

        listOrdersCheckout();
    }

    public void listOrdersCheckout() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"Nº Pedido", "Cliente", "Endereço"});
      
     
        for (int i = 0; i < generics.size(); i++) {

            try {

                //Corrigir realizar soma
                //this.lista.get(i).checkout(this.lista.get(i), this.lista.get(i).getPayment() , this.lista.get(i).getShipping());
                modelo.addRow(new Object[]{this.generics.get(i).getNumber()+1, this.generics.get(i).getCustomer().getName(), this.generics.get(i).getCustomer().getAddress()});
            } catch (Exception ex) {
                System.err.println("Error Message: " + ex.getMessage());
            }
        }

       jTable2.setModel(modelo);
    }

    public void centralizeFrame() {
        int x, y;
        Rectangle src = this.getGraphicsConfiguration().getBounds();
        Rectangle form = this.getBounds();

        x = (int) (src.getWidth() - form.getWidth()) / 2;
        y = (int) (src.getHeight() - form.getHeight()) / 2;
        this.setLocation(x, y);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fieldsetVendasCheckout = new javax.swing.JPanel();
        tabelaVendasCheckout = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        botaoVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fieldsetVendasCheckout.setBorder(javax.swing.BorderFactory.createTitledBorder("VendasCheckout"));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nº Pedido", "Cliente", "Endereço"
            }
        ));
        tabelaVendasCheckout.setViewportView(jTable2);

        javax.swing.GroupLayout fieldsetVendasCheckoutLayout = new javax.swing.GroupLayout(fieldsetVendasCheckout);
        fieldsetVendasCheckout.setLayout(fieldsetVendasCheckoutLayout);
        fieldsetVendasCheckoutLayout.setHorizontalGroup(
            fieldsetVendasCheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fieldsetVendasCheckoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabelaVendasCheckout, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );
        fieldsetVendasCheckoutLayout.setVerticalGroup(
            fieldsetVendasCheckoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fieldsetVendasCheckoutLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(tabelaVendasCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(botaoVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fieldsetVendasCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fieldsetVendasCheckout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoVoltar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SwingSalesReportView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SwingSalesReportView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SwingSalesReportView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SwingSalesReportView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SwingSalesReportView().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JPanel fieldsetVendasCheckout;
    private javax.swing.JTable jTable2;
    private javax.swing.JScrollPane tabelaVendasCheckout;
    // End of variables declaration//GEN-END:variables
}