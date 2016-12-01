/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_31;
import java.util.Scanner;
/**
 *
 * @author ismailtasdelen
 */
public class Java_Project_31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //
        // Örnek :
        //
        int m, k;
        int tutar = 0;
        Scanner tara = new Scanner(System.in);
        System.out.println("Ne kadar maaş alıyosun : ");
        m = tara.nextInt();
        System.out.println("Kaç parça ürün sattın : ");
        k = tara.nextInt();
        if (k>=1 & k<=10)
            tutar = m + k * 5 ;
        else if (k>=11 & k<=25)
            tutar = m + k * 11;
        else if (k>=26 & k<=40)
            tutar = m + k * 11;
        else if (k > 40)
            tutar = m + k * 30;
        System.out.println("Ödeyeceğiniz tutar : " + tutar);
    }
    
}