/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_12;
import java.util.Scanner;
/**
 *
 * @author Ismail Tasdelen
 */
public class Java_Project_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //
        // Örnek :
        //
        // M tamsayısı N tamsayısı ile bölündüğünde bölümü ve kalanı hesaplayan
        // bir program yazınız.
        // 
        Scanner tara = new Scanner(System.in);
        System.out.println("M değerini giriniz : ");
        int sayi_m = tara.nextInt();
        System.out.println("N değerini giriniz : ");
        int sayi_n = tara.nextInt();
        System.out.println("Bölümü : " + (sayi_m/sayi_n));
        System.out.println("Kalanı : "+ (sayi_m%sayi_n));
    }
    
}
