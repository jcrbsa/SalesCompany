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
public class SpreadSheetFactory {

    public static Document getSpreadSheet(String style) {
        if ("simple".equals(style)) {
            return new SimpleSpreadSheetDocument();
        }
        if ("fancy".equals(style)) {
            return new FancyLetterDocument();
        } else {
            return null;
        }
    }

}
