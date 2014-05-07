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


//Produto Abstrato
public abstract class Report {

    protected String content;

    public String getContent() {
        return content;
    }

    public abstract void getType();
    
   public abstract void printSalesCheckout();
    //public abstract void creatReport();

}
