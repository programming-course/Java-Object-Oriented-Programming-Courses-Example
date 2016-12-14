/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_63;

/**
 *
 * @author root
 */
public class Java_Project_63 {

    /**
     * @param args the command line arguments
     */
    public static int topla(int x, int y)
    {
    int t = x + y;
    return t;
    }
    public static int topla(int x, int y, int z)
    {
    int t = x + y + z;
    return t;
    }
    public static double topla(double x, double y)
    {
    double t = x + y;
    return t;
    }
    public static void main(String[] args) {
    // TODO code application logic here
    System.out.println(topla(2,3));
    System.out.println(topla(2.3,3.6));
    System.out.println(topla(1,2,3));
    }
    
}
