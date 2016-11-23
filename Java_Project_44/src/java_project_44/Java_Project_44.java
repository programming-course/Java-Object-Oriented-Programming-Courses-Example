/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_44;
import java.util.Scanner;
/**
 *
 * @author root
 */
public class Java_Project_44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //
        // Örnek :
        //
        int toplam = 0 ;
        int [] sicaklik = new int [7];
        Scanner tara = new Scanner(System.in);
        for (int i = 1; i <= 7; i++)
        {
            System.out.println(i + ". günün sıcaklığını giriniz : ");
            sicaklik[i-1] = tara.nextInt();
            toplam += sicaklik[i-1];
        }
        System.out.println("Ortalama sıcaklık : " + toplam / 7);
    }
    
}
