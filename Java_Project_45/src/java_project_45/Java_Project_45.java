/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_45;

/**
 *
 * @author root
 */
public class Java_Project_45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte [] not = {12,89,34,10};
        int eb = not[0];
        int ek = not[0];
        for (int i = 1; i < 4; i++){
        if (eb <not[i])
        {
            eb = not[i];
        }
        else if (ek > not[i])
        {
            ek = not[i];
        }
        }
        System.out.println(eb);
        System.out.println(ek);
    }
    
}
