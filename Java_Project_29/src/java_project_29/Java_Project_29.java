/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_29;
import java.util.Scanner;
/**
 *
 * @author ismailtasdelen
 */
public class Java_Project_29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //
        // Örnek :
        //
        int tutar;
        int r_indirim;
        int p_indirim;
        int n_indirim;
        int indirim = 0;
        int sonuc = 0;
        Scanner tara = new Scanner(System.in);
        System.out.println("Alışveriş tutarını giriniz : ");
        tutar = tara.nextInt();
        System.out.println("R indirimini giriniz : ");
        r_indirim = tara.nextInt();
        System.out.println("P indirimini giriniz : ");
        p_indirim = tara.nextInt();
        System.out.println("N indirimini giriniz : ");
        n_indirim = tara.nextInt();
        indirim = tutar * (r_indirim / 100) + (n_indirim - tutar) * (p_indirim /100);
        sonuc = n_indirim - indirim;
        System.out.println(sounc);
    }
    
}
