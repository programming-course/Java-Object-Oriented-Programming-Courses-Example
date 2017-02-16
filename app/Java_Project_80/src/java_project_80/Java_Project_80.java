/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_80;

/**
 *
 * @author ismailtasdelen
 */
public class Java_Project_80 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        newclass ogrenci_1 = new newclass("İsmail Taşdelen", "007");
        ogrenci_1.set_kayityili("2017");
        ogrenci_1.ogrencinoata();
        System.out.println(ogrenci_1.get_numarasi());
        newclass ogrenci_2 = new newclass("Nusret Gökçe", "008");
        ogrenci_2.set_kayityili("2017");
        ogrenci_2.ogrencinoata();
        System.out.println(ogrenci_2.get_numarasi());
        ogrenci_1.DersVeNotEkle("NTP", 100, 100);
        ogrenci_1.DersVeNotEkle("ALG", 100, 100);
        ogrenci_1.DersVeNotEkle("AGTML", 100, 100);
        ogrenci_1.DersVeNotEkle("MAT", 100, 100);
        ogrenci_1.DersVeNotEkle("FZK", 100, 100);
        ogrenci_1.DersVeNotEkle("WEB", 100, 100);
        ogrenci_1.DersVeNotEkle("GEO", 100, 100);
        ogrenci_1.DersVeNotEkle("BPP", 100, 100);
        ogrenci_1.OrtalamaHesapla();
        
    }
    
}
