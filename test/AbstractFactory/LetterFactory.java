package AbstractFactory;

import AbstractFactory.ProfessionalLetterDocument;
import AbstractFactory.Document;
import AbstractFactory.SimpleLetterDocument;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bruno.andrade
 */
public class LetterFactory {

    public static Document getLetter(String style) {
        if ("simple".equals(style)) {
            return new SimpleLetterDocument();
        }
        if ("pro".equals(style)) {
            return new ProfessionalLetterDocument();
        } 
         if ("fancy".equals(style)) {
            return new ProfessionalLetterDocument();
        } 
          throw new NullPointerException("Option no exist!");
    }
}
