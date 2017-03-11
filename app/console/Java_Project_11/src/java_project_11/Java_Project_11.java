 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_11;
import java.util.Scanner;
/**
 *
 * @author Ismail Tasdelen
 */
public class Java_Project_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //
        // Örnek :
        //
        // Klavyeden girilen X değerinin 5'e bölümünden kalanı ve bölümü ekrana
        // yazan programı yazın.
        //
        Scanner tara = new Scanner(System.in);
        System.out.println("Bir sayı girişi yapınız : ");
        int sayi = tara.nextInt();
        System.out.println("5'e bölümünden kalanı : " + (sayi%5));
        System.out.println("5'e bölümü : " + (sayi/5));
    }
    
}
