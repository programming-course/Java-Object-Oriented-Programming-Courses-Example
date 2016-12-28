/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_75;
import java.util.Scanner;
/**
 *
 * @author ismailtasdelen
 */
public class Java_Project_75 {

    /**
     * @param args the command line arguments
     */
    public static void aritmekseri(int a, int d, int n)
    {
        for (int i = 0; i < n; i++)
        {
            int sonuc = a+i*d;
            System.out.println("Sounç : " + sonuc);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tara = new Scanner(System.in);
        System.out.println("A değerini belirleyiniz : ");
        int a = tara.nextInt();
        System.out.println("B değerini belirleyiniz : ");
        int d = tara.nextInt();
        System.out.println("N değerini belirleyiniz : ");
        int n = tara.nextInt();
        aritmekseri(a, d, n);
    }
    
}
