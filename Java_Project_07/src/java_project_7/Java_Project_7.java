/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_7;
import java.util.Scanner;
/**
 *
 * @author Ismail Tasdelen
 */
public class Java_Project_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //
        // Örnek :
        //
        // Klavyeden girilen iki sayının toplamını, çarpımını ekrana görsel bir 
        // şekilde yazan programı yazınız.
        //
        Scanner tara = new Scanner(System.in);
        System.out.println("Birinci sayı girişini yapınız : ");
        int sayi1 = tara.nextInt();
        System.out.println("İkinci sayı girişini yapınız : ");
        int sayi2 = tara.nextInt();
        System.out.println("Toplam : " + (sayi1+sayi2));
        System.out.println("Çarpım : " + (sayi1*sayi2));
    }
    
}
