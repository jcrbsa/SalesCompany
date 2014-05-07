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
public class SimpleLetterDocument extends Document{
        @Override
	public String getTemplate(){
            return null;
	// conteúdo para retornar o template deste tipo de documento
        }
        @Override
	public String getType(){
	return "Simple Letter"; }
}
