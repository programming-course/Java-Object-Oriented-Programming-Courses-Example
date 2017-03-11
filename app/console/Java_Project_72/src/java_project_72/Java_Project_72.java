/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_72;
import java.util.Scanner;
/**
 *
 * @author ismailtasdelen
 */
public class Java_Project_72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tara = new Scanner(System.in);
        dortgen d1 = new dortgen();
        System.out.println(d1.NesneSayisiGoster());
        dortgen d2 = new dortgen(3, 4);
        System.out.println(d1.NesneSayisiGoster());
        dortgen d3 = new dortgen(2, 0);
        System.out.println(d1.NesneSayisiGoster());
    }
    
}
