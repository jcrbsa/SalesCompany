/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author bruno.andrade
 */
public class Cliente {

    public static void main(String[] args) {
        Document letter1 = DocumentFactory.getDocument("letter", "simple");
        Document letter2 = DocumentFactory.getDocument("letter", "pro");
        Document sp1 = DocumentFactory.getDocument("spreadsheet", "simple");
        Document sp2 = DocumentFactory.getDocument("spreadsheet", "pro");
        System.out.println(letter1.getType()); // Simple Letter
        System.out.println(letter2.getType()); // Pro Letter
        System.out.println(sp1.getType()); // Simple Spreadsheet
        System.out.println(sp2.getType()); // Fancy Spreadsheet
    }
}
