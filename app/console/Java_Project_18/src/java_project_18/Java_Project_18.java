/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_18;
import java.util.Scanner;
/**
 *
 * @author ismailtasdelen
 */
public class Java_Project_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int R, r;
        float pi = (float)22/7;
        System.out.println(pi);
        Scanner tara = new Scanner(System.in);
        System.out.println("Çemberin çapını giriniz : ");
        R = tara.nextInt();
        r = R/2;
        float cevre = 2 * pi * r;
        System.out.println("Çevresi : " + cevre);
        
    }
    
}
