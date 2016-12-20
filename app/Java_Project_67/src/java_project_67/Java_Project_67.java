/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_67;
import java.util.Scanner;
/**
 *
 * @author ismailtasdelen
 */
public class Java_Project_67 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tara = new Scanner(System.in);
        school_class ogrenci_1 = new school_class();
        ogrenci_1.adsoyad = "İsmail Taşdelen";
        ogrenci_1.dersadi = "Nesne Tabanlı Programlama";
        ogrenci_1.dersnotu = 100;
        ogrenci_1.sinif = "1.Sınıf";
        ogrenci_1.tc="01234567890";
        System.out.println(ogrenci_1.adsoyad + "isimli ögrenci" + ogrenci_1.dersadi + "dan");
        ogrenci_1.kontol();
        
    }
    
}
