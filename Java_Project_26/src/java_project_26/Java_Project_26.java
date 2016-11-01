/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_26;
import java.util.Scanner;
/**
 *
 * @author ismailtasdelen
 */
public class Java_Project_26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //
        // Örnek :
        //
        double avm, indirim=0, odeme=0;
        Scanner tara = new Scanner(System.in);
        System.out.println("Alışveriş miktarınızı giriniz : ");
        avm = tara.nextDouble();
        if (avm <= 1000)
            indirim = avm * 5 / 100;
        else if (avm >= 1000 & avm < 10000)
            indirim = avm * 8 /100;
        else if (avm >=10000)
            indirim = avm * 8.5 / 100;
            
        odeme = avm - indirim;
        System.out.println("Ödenecek :" + odeme);
    }
    
}
