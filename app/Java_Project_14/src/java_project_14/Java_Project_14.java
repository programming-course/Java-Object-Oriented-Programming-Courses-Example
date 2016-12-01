/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_14;

/**
 *
 * @author Ismail Tasdelen
 */
public class Java_Project_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //
        // Örnek :
        //
        // X, Y ve Z sayıları verilmiştir. Bu sayıları kullanarak X-Y, X-Z ve 
        // Y-Z farkları ile bu farkların ortalamasını hesaplayıp görüntüleyen bir
        // program yazınız.
        //
        int x = 1;
        int y = 2;
        int z = 3;
        System.out.println("A ve B'nin Toplamaları : " + (x-y) + " " + "Ortalama : " + (x-y)/2 );
        System.out.println("A ve C'nin Toplamları : " + (x-z)  + " " + "Ortalama : " + (x-y)/2 );
        System.out.println("B ve C'nin Toplamları : " + (y-z)  + " " + "Ortalama : " + (y-z)/2 );
    }
    
}
