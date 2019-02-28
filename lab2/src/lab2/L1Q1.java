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
public class L1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(substituteAI("iamkc"));
    }
    public static String substituteAI (String i){
        while(i.length()>1){
        if(i.charAt(0)=='a')
            return 'i' +substituteAI (i.substring(1));
        else 
            return i.charAt(0)+ substituteAI (i.substring(1));
            
    }
        return i;
    }
    

    }
    

