/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_30;
import java.util.Scanner;
/**
 *
 * @author ismailtasdelen
 */
public class Java_Project_30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //
        // Örnek :
        //
        int m, n, r;
        int tutar = 0;
        Scanner tara = new Scanner(System.in);
        System.out.println("Mesaj başı ücret : ");
        m = tara.nextInt();
        System.out.println("20 mesajdan sonra ki indirim oranı : ");
        n = tara.nextInt();
        System.out.println("Kaç tane mesaj attın : ");
        r = tara.nextInt();
        if (n <= 20)
            tutar = m * n;
        else if(n > 20)
            tutar = 20 * m + (n - 20) * (m - m * r / 100);
        System.out.println("Ödeyeceğiniz tutar : " + tutar);
    }
    
}
