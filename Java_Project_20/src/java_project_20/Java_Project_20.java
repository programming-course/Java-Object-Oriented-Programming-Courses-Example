/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_20;
import java.util.Scanner;
/**
 *
 * @author ismailtasdelen
 */
public class Java_Project_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tara = new Scanner(System.in);
        System.out.println("A kenarını giriniz :");
        int a = tara.nextInt();
        System.out.println("B kenarını giriniz :");
        int b = tara.nextInt();
        System.out.println("C kenarını giriniz :");
        int c = tara.nextInt();
        int alan, cevre;
        cevre = a + b + c;
        alan = (a * b) / 2;
        System.out.println("Alanı : " + alan);
        System.out.println("Çevresi : " + cevre);
        int hkare = a*a*b*b/(a*a+b*b);
        System.out.println("H Değeri : " + Math.sqrt(hkare));

    }
    
}