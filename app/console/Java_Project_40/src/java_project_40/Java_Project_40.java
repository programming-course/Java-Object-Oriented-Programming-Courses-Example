/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_40;
import java.util.Scanner;
/**
 *
 * @author ismailtasdelen
 */
public class Java_Project_40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tara = new Scanner(System.in);
        System.out.println("Bir sayı griiniz : ");
        int sayi = tara.nextInt();
        int number = 0;
        int toplam = 0;
        for (int i= 1; i <= sayi; i++)
        {
           System.out.println(i + ". sayı giriniz :");
           number = tara.nextInt();
           toplam +=number; 
        }
        System.out.println("Toplam : "+ toplam);
    
    }
    
}
