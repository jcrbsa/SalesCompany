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
public class SimpleSpreadSheetDocument extends Document {

    public String getTemplate() {
        return "Simple Spreadsheet Template !";
    }

    public String getType() {
        return "Simple Spreadsheet";
    }
}
