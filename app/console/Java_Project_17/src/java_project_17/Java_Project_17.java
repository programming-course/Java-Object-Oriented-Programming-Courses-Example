/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_17;
import java.util.Scanner;
/**
 *
 * @author ismailtasdelen
 */
public class Java_Project_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tara = new Scanner(System.in);
        int a, b, alan, cevre;
        System.out.println("a kenarını giriniz : ");
        a = tara.nextInt();
        System.out.println("b kenarını giriniz : ");
        b = tara.nextInt();
        alan = a * b;
        cevre = (a + b) * 2;
        System.out.println("Çeversi : " + cevre + " " +  "Alanı : " + alan);
    }
    
}
