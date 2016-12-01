/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_25;
import java.util.Scanner;
/**
 *
 * @author ismailtasdelen
 */
public class Java_Project_25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //
        // Örnek :
        //
        double s,u, ucret;
        ucret = 0;
        Scanner tara = new Scanner(System.in);
        System.out.println("Kaç saat çalıştı : ");
        s = tara.nextDouble();
        System.out.println("Saat başı kazlınan ücret : ");
        u = tara.nextDouble();
        if (s <= 40) 
            ucret = s * u;
        else if (s > 40)
            ucret = 40 * u + (s-40) * u * 1.5;
        
        System.out.println("Kazancınız : " + ucret);
    }
    
}
