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
public abstract class Document {

    protected String content;

    public String getContent() {
        return content;
    }

    public abstract String getTemplate();

    public abstract String getType();

}
