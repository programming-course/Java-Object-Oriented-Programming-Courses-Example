/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_62;
import java.util.Scanner;

/**
 *
 * @author root
 */
public class Java_Project_62 {

    /**
     * @param args the command line arguments
     */
    public static void polinom()
    {
    Scanner tara = new Scanner(System.in);
    System.out.println("A değerini giriniz : ");
    int a = tara.nextInt();
    System.out.println("B değerini giriniz : ");
    int b = tara.nextInt();
    System.out.println("C değerini giriniz : ");
    int c = tara.nextInt();
    System.out.println("D değerini giriniz : ");
    int d = tara.nextInt();
    System.out.println("X değerini giriniz : ");
    int x = tara.nextInt();
    double polinom = a + (b*x) + c*Math.pow((double)x, 2)+d*Math.pow((double)x, 3);
    System.out.println("Sonuç : " + polinom);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        polinom();
    }
    
}
