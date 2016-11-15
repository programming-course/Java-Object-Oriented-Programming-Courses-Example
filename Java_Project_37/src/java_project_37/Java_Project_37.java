/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_37;
import java.util.Scanner;
/**
 *
 * @author ismailtasdelen
 */
public class Java_Project_37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tara = new Scanner(System.in);
        System.out.println("Bir metin giriniz : ");
        String metin = tara.nextLine();
        for (int i=1; i<=100; i++)
        {
        System.out.println(i + ". "+ metin);
        }
    }
    
}
