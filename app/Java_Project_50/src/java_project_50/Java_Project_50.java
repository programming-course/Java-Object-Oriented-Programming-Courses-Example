/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_50;
import java.util.Scanner;
/**
 *
 * @author ismailtasdelen
 */
public class Java_Project_50 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int [] [] snc= {{0, 0, 0, 0, 0},{0, 0, 0, 0, 0},{0, 0, 0, 0, 0},{0, 0, 0, 0, 0},{0, 0, 0, 0, 0},{0, 0, 0, 0, 0},{0, 0, 0, 0, 0}};
    Scanner tara = new Scanner(System.in);
    System.out.println("Kaç kişi oy kullanacak");
    int n = tara.nextInt();
    for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < 7; j++)
            {
            System.out.println((j+1)+".soruyu cevapla"
                    + "1.Olumlu/2.olumlu/3.tarafsız"
                    + "4.olumsuz/5olumsuz.");
            int x = tara.nextInt();
            snc [j][(x-1)]++;
            }                
        }
    System.out.println("Soru No/ÇO/O/T/OS/ÇOS");
    for (int i = 0; i < 7; i++)
    {
        System.out.println((i+1)+"soruya:");
        for (int j=0; j < 5; j++)
        {
            System.out.println(snc[i][j]*100/n+"/n");
        }
        System.out.println();
    }
    }
}
