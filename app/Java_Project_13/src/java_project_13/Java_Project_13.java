/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_13;
import java.util.Scanner;
/**
 *
 * @author Ismail Tasdelen
 */
public class Java_Project_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //
        // Örnek :
        //
        // A, B ve C sayıları verilmiştir. Bu sayıları kullanarak A+B, A+C ve B+C
        // toplamları ile bu toplamların ortalamasını hesaplayıp bir görüntüleyen 
        // bir program yazınız.
        //
        int a = 1;
        int b = 2;
        int c = 3;
        System.out.println("A ve B'nin Toplamaları : " + (a+b) + " " + "Ortalama : " + (a+b)/2 );
        System.out.println("A ve C'nin Toplamları : " + (a+c)  + " " + "Ortalama : " + (a+c)/2 );
        System.out.println("B ve C'nin Toplamları : " + (b+c)  + " " + "Ortalama : " + (b+c)/2 );
    }
    
}
