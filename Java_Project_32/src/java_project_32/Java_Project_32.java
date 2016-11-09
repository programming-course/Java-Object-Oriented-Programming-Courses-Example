/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_32;
import java.util.Scanner;
/**
 *
 * @author ismailtasdelen
 */
public class Java_Project_32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //
        // Örnek :
        //
        Scanner tara = new Scanner(System.in);
        System.out.println("1-6 arası bir sayı griniz : ");
        int x = tara.nextInt();
        if (x>6 & x<1)
        {
            System.out.println(" Hatalı Giriş ! ");
        }
        else if(x == 1)
        {
            System.out.println("===\n=+=\n===");
        }
        else if(x == 2)
        {
            System.out.println("==+\n===\n+==");
        }
        else if(x == 3)
        {
            System.out.println("==+\n=+=\n+==");
        }
        else if(x == 4)
        {
            System.out.println("+=+\n===\n+=+");
        }
        else if(x == 5)
        {
            System.out.println("+=+\n=+=\n+=+");
        }
        else if(x == 6)
        {
            System.out.println("+++\n===\n+++");
        }
    }
    
}
