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
           System.out.println("Logger Actived");
           return loggerObject;
       }else{
           System.out.println("");
           return loggerObject;
       }
           
   }
   
   public static void printDetails(String text){
       if(status == true){
       System.out.println(text);
       }
       
   }
   public static void turnON(){
       status =  true;
      
       
   }
   
   public static void turnOFF(){
       status = false;

   }
  
   
}
