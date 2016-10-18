/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_6;
import java.util.Scanner;
/**
 *
 * @author ismailtasdelen
 */
public class Java_Project_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //
        // Ders Notları :
        //
        // Bazı Scanner Yöntemleri :
        //
        // Next(); Klavyeden girilen il kelimeyi boşluğa kadar okur.
        // nextLine(); Klavyeden girilen tüm ifadeyi boşluklar dahil okur.
        // findLine(".")charAt(0); Klavyeden girilen ifadeyi karakterlerine
        // ayırarak okur.
        // nextint(); Klavyeden girilen integer tipine çevirir.
        // nextFloat Klavyeden girilen float tipine çevirir.
        // nextDouble(); Klavyeden girilen ifadeyi double tipine çevirir.
        //
        // Bilgi Giriş Çıkışı :
        //
        // System.in klavyeden veri girileceğinde
        // System.out işlem ve mesajların ekran yazdırılacağında
        // System.err hata mesajlarında kullanılmaktadır.
        //
        // Örnek 1 :
        //
        System.out.println("Bir sayı girişi yapınız :");
        Scanner tara = new Scanner(System.in);
        int s1 = tara.nextInt();
        System.out.println(5*s1);
        //
        // Örnek 2 :
        //
        Scanner tara1 = new Scanner(System.in);
        System.out.println("Birinci sayı girişini yapınız : ");
        int sayi1 = tara1.nextInt();
        System.out.println("İkinci sayı girişini yapınız : ");
        int sayi2 = tara1.nextInt();
        int toplam = sayi1 + sayi2;
        int carpim1 = sayi1 * sayi2;
        System.out.println("Sayıların Toplamı : " + toplam);
        System.out.println("Sayıların Çarpımı : " + carpim1);
        //
        // Örnek 3 :
        //
        int sayi3 = 2;
        int sayi4 = 3;
        int carpim2;
        int bolum1;
        int kalan1;
        carpim2 = sayi3 * sayi4;
        bolum1 = sayi3 / sayi4;
        kalan1 = sayi3%sayi4;
        System.out.println("Sayıların Çarpımı : " + carpim2);
        System.out.println("Sayıların Bölümü : " + bolum1);
        System.out.println("Sayıların Kalanı : " + kalan1);
        //
        // Örnek 4 :
        //
        Scanner tara2 = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int x1 = tara2.nextInt();
        System.out.println("Karesi : " + (x1*x1));
        //
        // Örnek 5 : 
        //
        Scanner tara3 = new Scanner(System.in);
        System.out.println("X değerini giriniz : ");
        int x2 = tara3.nextInt();
        System.out.println("Bölümü : " + x2 / 2 );
        System.out.println("Kalanı : " + x2 % 2 );
        //
        // Örnek 6 :
        //
        Scanner tara4 = new Scanner(System.in);
        System.out.println("X değerini giriniz : ");
        float x3 = tara4.nextInt();
        System.out.println("Bölümü : " + x3 / 2 );
        System.out.println("Kalanı : " + x3 % 2 );
        //
        // Örnek 7 :
        //
        Scanner tara5 = new Scanner(System.in);
        System.out.println("X değerini giriniz : ");
        int x4 = tara5.nextInt();
        System.out.println("Y değerini giriniz : ");
        int y1 = tara5.nextInt();
        System.out.println("Bölümü : " + x4 / y1 );
        System.out.println("Kalanı : " + x4 % y1 );
        //
        // Örnek 8 :
        //
        int a,b,c;
        Scanner tara6 = new Scanner(System.in);
        System.out.println("A değerini giriniz : ");
        a = tara6.nextInt();
        System.out.println("B değerini giriniz : ");
        b = tara6.nextInt();
        System.out.println("C değerini giriniz : ");
        c = tara6.nextInt();
        System.out.println("A değeri : " + a);
        System.out.println("B değeri : " + b);
        System.out.println("C değeri : " + c);
        System.out.println("A ve B'nin ortalaması : " + ( a + b) / 2);
        System.out.println("A ve C'nin ortalaması : " + (a + c) / 2);
        System.out.println("B ve C'nin ortalaması : " + (b + c) / 2);
        System.out.println("ABC'nin ortalaması : " + (a + b + c) / 2);
        //
        // örnek 9 :
        //
        int a_kenari = 5;
        int b_kenari = 7;
        System.out.println("Dikdörtge'nin çeversi : " + (a_kenari + b_kenari)*2);
        System.out.println("Dikdörtge'nin alanı : " + a_kenari * b_kenari);
    }
    
}
