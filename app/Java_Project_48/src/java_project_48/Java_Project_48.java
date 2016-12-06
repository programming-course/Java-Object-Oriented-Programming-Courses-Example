/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_48;
import java.util.Scanner;
/**
 *
 * @author ismailtasdelen
 */
public class Java_Project_48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tara = new Scanner(System.in);
        int [] oy = {0, 0, 0, 0, 0};
        for (int i = 1; i<=1362; i++)
        {
            System.out.println(i + ". Kişi Hoşgeldiniz, 0 ile 4 arasında oy kullanın.");
            int x = tara.nextInt();
            if (x == 0)
                oy [0] ++;
            else if (x == 1)
                 oy [1] ++;
            else if (x == 2)
                 oy [2] ++;
            else if (x == 3)
                 oy [3] ++;
            else if (x == 4)
                 oy [4] ++;
        }
        int eb = oy[0], sira =0;
        for (int i = 0; i<4; i++)
        {
            System.out.println(i + ". adayın oy sayısı " + oy[i]);
            if (eb<oy[i])
                eb = oy[i];
                sira =i;
        }
    }
    
}
