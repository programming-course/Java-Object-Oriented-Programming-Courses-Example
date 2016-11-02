/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_27;
import java.util.Scanner;
/**
 *
 * @author ismailtasdelen
 */
public class Java_Project_27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //
        // Örnek :
        //
        int a;
        Scanner tara = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        a = tara.nextInt();
        if (a>0 )
            System.out.println("Pozitif");
        else
            System.out.println("Negatif");        
    }
    
}
