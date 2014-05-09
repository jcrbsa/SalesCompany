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
public class FancySpreadSheetDocument extends Document {


    public String getType() {
        return "Fancy Spreadsheet";
    }

    @Override
    public String getTemplate() {

        return "Fancy Spreadsheet";
    }
}
