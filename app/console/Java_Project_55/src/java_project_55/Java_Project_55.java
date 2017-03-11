/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_55;
import java.util.Scanner;

/**
 *
 * @author root
 */
public class Java_Project_55 {

    /**
     * @param args the command line arguments
     */
    public static double harfnotu_hesapla(double vize, double finall){
        double ort = (vize/100)*40 + (finall/100)*60;
        String harf = "";
        if (ort >= 90)
            harf = "A+";
        else if (ort >= 85)
            harf = "A-";
        else if (ort >= 80)
            harf = "B+";
        else if (ort >= 75)
            harf = "B";
        else if (ort >= 70)
            harf = "B-";
        else if (ort >= 65)
            harf = "C+";
        else if (ort >= 60)
            harf = "C-";
        else if (ort >= 55)
            harf = "C+";
        else if (ort >= 50)
            harf = "D+";
        else if (ort >= 45)
            harf = "D";
        else if (ort >= 40)
            harf = "D-";
        else if (ort >= 35)
            harf = "F+";
        else if (ort >= 0)
            harf = "F-";
        
        return ort;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tara = new Scanner(System.in);
        System.out.println("Vize notunu giriniz : ");
        double vize = tara.nextDouble();
        System.out.println("Final notunu giriniz : ");
        double finall = tara.nextDouble();
        System.out.println("Ortalamanız : " + harfnotu_hesapla(vize,finall));
    }
    
}