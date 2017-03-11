/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_21;
import java.util.Scanner;
/**
 *
 * @author ismailtasdelen
 */
public class Java_Project_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, b, c;
        double art_ort, har_ort;
        Scanner tara = new Scanner(System.in);
        System.out.println("A değerini giriniz : ");
        a = tara.nextInt();
        System.out.println("B değerini giriniz : ");
        b = tara.nextInt();
        System.out.println("C değerini giriniz : ");
        c = tara.nextInt();
        art_ort = (a + b + c)/3;
        har_ort = 3 / (1/a+1/b+1/c);
        System.out.println("Aritmatik Ortalama : " + art_ort);
        System.out.println("Harmonik Ortalama : " + har_ort);
    }
    
}
