/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_28;
import java.util.Scanner;
/**
 *
 * @author ismailtasdelen
 */
public class Java_Project_28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //
        // Örnek :
        //
        int not;
        Scanner tara = new Scanner(System.in);
        System.out.println("Notunuzu giriniz : ");
        not = tara.nextInt();
        if (not>0 &  not<=69)
            System.out.println("Belge Alamaz!");
        else if(not>=70 & not <=84)
            System.out.println("Teşekkür Belgesi");
        else if(not >=85 & not<=100)
            System.out.println("Taktir Belgesi");
    }
    
}
