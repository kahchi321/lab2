/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author wic180056
 */
public class L1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(permuteString("ABC"));
    }
    
   public static String permuteString(String s){
       while(s.length()>1){
      return position(s.charAt(0),s.substring(1))+ (s.substring(1));}
       return s;
   } 
   
   public static String position(char a , String s){
       return a + s +"\n" + s+a + "\n" ;
       
   }
}
