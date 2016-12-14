/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_61;
import java.util.Scanner;
/**
 *
 * @author root
 */
public class Java_Project_61 {

    /**
     * @param args the command line arguments
     */
    public static void toplam()
    {
    Scanner tara = new Scanner(System.in);
    System.out.println("Bir sayı giriniz : ");
    int sayi = tara.nextInt();
    int karesi = sayi * sayi;
    System.out.println("Karesi : " + karesi);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        toplam();
    }
    
}
