/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_19;
import java.util.Scanner;
/**
 *
 * @author ismailtasdelen
 */
public class Java_Project_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int R, r; 
        float pi = (float)3.14159f;
        Scanner tara = new Scanner(System.in);
        System.out.println("Çapını giriniz : ");
        R = tara.nextInt();
        r = R/2;
        float alan = r * pi * r;
        System.out.println("Alan : " + alan);
        
    }
    
}
