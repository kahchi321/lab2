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
public class L1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(exponent(10,3));
    }
    public static long exponent(int x, int m) { 
        if(m==1)
            return x;
        else
            return x*exponent(x,m-1);
}

}
