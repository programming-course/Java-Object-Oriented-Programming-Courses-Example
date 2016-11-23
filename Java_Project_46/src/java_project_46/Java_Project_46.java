/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_46;
import java.util.Arrays;
/**
 *
 * @author root
 */
public class Java_Project_46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //
        // Örnek :
        //
        byte [] not = {12, 89, 34 , 10};
        byte gecici = 0;
        Arrays.sort(not);
        for (int i = 0; i < 4; i++)
        {
            System.out.println(not[i]);
        }
    }
}
