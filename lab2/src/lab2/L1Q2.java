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
    public class L2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String s = "ABC"; 
        int n = s.length(); 
        permuteString(s, 0, n-1); 
    }
    
    public static void permuteString(String s, int l, int r) { 
        if (l == r) 
            System.out.println(s); 
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
                s = swap(s,l,i); 
                permuteString(s, l+1, r); 
                s = swap(s,l,i); 
            } 
        } 
    } 
    
     public static String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
  
} 
