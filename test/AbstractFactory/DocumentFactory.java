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
public class DocumentFactory {

    public static Document getDocument(String type, String style) {
        if ("letter".equals(type)) {
            return LetterFactory.getLetter(style);
        }
        if ("spreadsheet".equals(type)) {
            return SpreadSheetFactory.getSpreadSheet(style);
        }
        return null;
    }
}
