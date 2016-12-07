/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_51;
/**
 *
 * @author ismailtasdelen
 */
public class Java_Project_51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //
        // MATH CLASS
        //
        // Math.PI --> Pi sayısını alır.
        // Abs(x); --> Mutlak değeri alır.
        // Ceil(x); --> Ondalıklı sayıyı üst sayıya yuvarlar.
        // Math.raounds(); --> Ondalıklı sayıyı yuvarlar.
        // Sin(x); --> Sin değerini alır.
        // Tan(x); --> Tan değerini alır.
        // Asin(x); --> Asin değerini alır.
        // pow(x, y); --> x'nin y'ninci 
        // sqrt(x); --> Karekökünü alır.
        // Max(x, y); --> En büyük değeri bulur.
        // Min(x, y); --> En küçük değeri bulur.
        // RAndom(); --> Rasagele sayı üretir. 0 - 1 arasında.
        //
        // Örnek :
        //
        double x = 3.12, y = 3.5, z = 3.6;
        System.out.println(Math.PI);
        System.out.println(Math.abs(x));
        System.out.println(Math.ceil(x));
        System.out.println(Math.round(x));
        System.out.println(Math.round(y));
        System.out.println(Math.round(z));
        System.out.println(Math.sin(30));
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.max(y, z));
        System.out.println(Math.random());
    }
    
}
