/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_59;
import java.util.Scanner;
/**
 *
 * @author root
 */
public class Java_Project_59 {

    /**
     * @param args the command line arguments
     */
    public static void carp()
    {
    Scanner tara = new Scanner(System.in);
    System.out.println("1. Sayının değerini giriniz : ");
    int sayi1 = tara.nextInt();
    System.out.println("2. Sayının değerini giriniz : ");
    int sayi2 = tara.nextInt();
    int carp = sayi1 * sayi2;
    System.out.println(carp);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        carp();
    }
    
}
