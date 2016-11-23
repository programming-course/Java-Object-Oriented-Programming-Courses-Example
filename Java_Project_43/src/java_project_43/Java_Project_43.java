/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_43;

/**
 *
 * @author root
 */
public class Java_Project_43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //
        // Örnek :
        //
        byte [] sicaklik = {10,11,12,13,14,15,16};
        int ort = 0;
        for (int i = 0; i < 7; i++)
        {
        System.out.println(i + " . Sıcaklık = " + sicaklik[i]);
        ort = ort + sicaklik[i];
        }
        ort = ort / 7;
        System.out.println("Ortlama Sıcaklık : " + ort);
    }
}
