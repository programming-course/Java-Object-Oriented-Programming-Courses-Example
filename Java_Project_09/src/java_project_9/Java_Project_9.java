/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_9;
import java.util.Scanner;
/**
 *
 * @author Ismail Tasdelen
 */
public class Java_Project_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //
        // Örnek :
        //
        // Girilen bir sayının karesini hesaplayan programı yazınız.
        //
        Scanner tara = new Scanner(System.in);
        System.out.println("Sayı girişini yapınız : ");
        int sayi = tara.nextInt();
        System.out.println("Sayının K5aresi : " + (sayi*sayi));
    }
    
}
