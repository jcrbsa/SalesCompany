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
class FancyLetterDocument extends Document {

    public FancyLetterDocument() {
    }

    @Override
    public String getTemplate() {
        return "Fancy Letter Template !";
    }

    @Override
    public String getType() {
        return "FancyLetterDocument ";
    }
    
}
