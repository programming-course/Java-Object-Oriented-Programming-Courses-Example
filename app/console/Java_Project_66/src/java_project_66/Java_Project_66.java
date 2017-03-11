/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_66;
import java.util.Scanner;
/**
 *
 * @author ismailtasdelen
 */
public class Java_Project_66 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tara = new Scanner (System.in);
        new_class hesapla = new new_class();
        hesapla.boy=10;
        hesapla.en=15;
        hesapla.boy=20;
        hesapla.en=30;
        System.out.println(hesapla.dortgen_alan_hesaplama());
        System.out.println(hesapla.dortgen_alan_hesaplama());
    }
    
}
