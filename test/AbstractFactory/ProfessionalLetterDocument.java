package AbstractFactory;

import AbstractFactory.Document;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bruno.andrade
 */
class ProfessionalLetterDocument extends Document {

    @Override
    public String getTemplate() {
        return "ProfessionalLetterDocument Template !";

    }

    @Override
    public String getType() {
        return "Pro Letter";
    }
}

    

