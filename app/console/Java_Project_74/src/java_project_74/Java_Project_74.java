/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_74;
import java.util.Scanner;
/**
 *
 * @author ismailtasdelen
 */
public class Java_Project_74 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bisiklet b1 = new bisiklet();
        bisiklet b2 = new bisiklet(4);
        bisiklet b3 = new bisiklet(5, 5.4);
        b3.HiziDegistir(6);
        System.out.println(b3.HiziAl());
        b3.HiziArtir();
        System.out.println(b3.VitesAl());
        b3.HiziAzlat();
        System.out.println(b3.HiziAl());
        b3.Kontrol();
        System.out.println(b3.VitesAl());
    }
    
}
