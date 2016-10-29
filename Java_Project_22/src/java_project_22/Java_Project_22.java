/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_22;
import java.util.Scanner;
/**
 *
 * @author İsmail Taşdelen
 */
public class Java_Project_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //
        // Örnek :
        //
        // 0 - 99 arası sayıların okunusunu yazdıran program.
        //
        Scanner tara = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int sayi=tara.nextInt();
        int b = sayi%10;
        int o=sayi/10;
        switch (o) {
            case 0: {  System.out.print("-"); break; }
            case 1: { System.out.print("on");break;}
            case 2: { System.out.print("yirmi"); break;}
            case 3: { System.out.print("otuz"); break;}
            case 4: { System.out.print("kırk");break; }
            case 5: {  System.out.print("elli");   break;  }
            case 6: { System.out.print("altmış"); break; }
            case 7: { System.out.print("yetmiş");break; }
            case 8: {System.out.print("seksen");break;}
            case 9: { System.out.print("doksan");break;}
            default:{System.out.println("hata");break;}
        }
        switch (b) {
            case 0: {  System.out.println("sıfır"); break; }
            case 1: { System.out.println("bir");break;}
            case 2: { System.out.println("iki"); break;}
            case 3: { System.out.println("üç"); break;}
            case 4: { System.out.println("dört");break; }
            case 5: {  System.out.println("beş");   break;  }
            case 6: { System.out.println("altı"); break; }
            case 7: { System.out.println("yedi");break; }
            case 8: {System.out.println("sekiz");break;}
            case 9: { System.out.println("dokuz");break;}
            default:{System.out.println("hata");break;}
        }
    }
    
}
