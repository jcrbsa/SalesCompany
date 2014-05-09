/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utils;

/**
 *
 * @author bruno.andrade
 */
public class Logger {
 
   public static Logger loggerObject;

  private static boolean status = false;
   private Logger(){}
   
   
   public static Logger getLogger(){
       if(status)
       {  loggerObject = new Logger();
           System.out.println("Create a neew Object");
           return loggerObject;
       }else{
           System.out.println("");
           return loggerObject;
       }
           
   }
   
   public void printDetails(String text){
       System.out.println(text);
       
   }
   public void turnON(){
       status =  true;
      
       
   }
   
   public void turnOFF(){
       status = false;

   }
  
   
}
