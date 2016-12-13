/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_54;
import java.util.Scanner;
/**
 *
 * @author root
 */
public class Java_Project_54 {

    /**
     * @param args the command line arguments
     */
    public static double hesapla(double vize, double finall){
        double ort = (vize/100)*40 + (finall/100)*60; 
        return ort;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tara = new Scanner(System.in);
        System.out.println("Vize notunu giriniz : ");
        double vize = tara.nextDouble();
        System.out.println("Final notunu giriniz : ");
        double finall = tara.nextDouble();
        System.out.println("Ortalamanız : " + hesapla(vize,finall));
        
    }
    
}
