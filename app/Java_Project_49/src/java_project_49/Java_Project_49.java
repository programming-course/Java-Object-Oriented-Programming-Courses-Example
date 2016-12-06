/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_49;
import java.util.Scanner;
/**
 *
 * @author ismailtasdelen
 */
public class Java_Project_49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tara = new Scanner(System.in);
        System.out.print("Başlamak için 1'e basın : ");
        int x = tara.nextInt();
        if (x == 1)
        {
            int a = (int)(Math.random()*3);
            int b = (int)(Math.random()*3);
            int c = (int)(Math.random()*3);
            if (a ==b & b ==c )
                System.out.println("100 altın kazandın.");
            else if (a==b  || b==c || a==c)
                System.out.println("15 altın kazandınız.");
            else if (a !=b & b!=c & a!=c)
                System.out.println("Kazamadın.");
        }
    }
    
}
