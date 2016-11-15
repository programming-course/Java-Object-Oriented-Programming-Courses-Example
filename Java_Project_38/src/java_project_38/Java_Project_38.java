/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_38;
import java.util.Scanner;
/**
 *
 * @author ismailtasdelen
 */
public class Java_Project_38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tara = new Scanner(System.in);
        System.out.println("Bir sayı girişi yapınız : ");
        int sayi = tara.nextInt();
        int fak = 1;
        for (int i=1; i <= sayi; i++)
        {
        fak *=i;
        }
        System.out.println(fak);
    }
    
}
