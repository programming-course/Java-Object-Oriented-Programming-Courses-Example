/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_4;

/**
 *
 * @author ismailtasdelen
 */
public class Java_Project_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //
        // Ders Notları :::
        //
        // Tür Dönüşümü ( Casting ) ::
        //
        // Not : Veri_Tipi değişken = (Veri_Tipi)dönüşecek_veri;
        //
        // Örnek 1 :
        //
        // Tam sayıya çevirmek.
        //
        int a;
        float b=3.17f;
        a=(int)b;
        System.out.println(a);
        //
        // Örnek 2 :
        //
        // Ondalıklı sayıya çevirmek.
        //
        int sayi_a = 15;
        double yeni_a;
        yeni_a = (double)sayi_a;
        System.out.println(yeni_a);
        //
        // Örnek 3 :
        //
        byte sayi_b = 3;
        int yeni_b;
        yeni_b = (int)sayi_b;
        System.out.println(yeni_b);
        //
        // Örnek 4 :
        //
        int x1 = 22;
        byte y =(byte)x1;
        System.out.println(y);
        //
        // Örnek 5 :
        //
        String s1 = "123";
        int x2 = Integer.valueOf(s1);
        System.out.println(x2-2);
        //
       }
    
}
