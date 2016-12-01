/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_15;
import java.util.Scanner;
/**
 *
 * @author ismailtasdelen
 */
public class Java_Project_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tara = new Scanner(System.in);
        System.out.println("x sayısını giriniz : ");
        int x = tara.nextInt();
        System.out.println("y sayısını giriniz : ");
        int y = tara.nextInt();
        System.out.println("z sayısını giriniz : ");
        int z = tara.nextInt();
        int f1, f2, f3, ort;
        f1 = x-z;
        f2 = x-y;
        f3 = y-z;
        ort = (f1+f2+f3)/3;
        System.out.println("Farklarının ortalaması : " + ort);
    }
    
}
