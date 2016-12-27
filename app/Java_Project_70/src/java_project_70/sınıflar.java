/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_70;

/**
 *
 * @author ismailtasdelen
 */
public class sınıflar{
    private double en;
    public double boy;
    public sınıflar()
    {
    en=10;
    }
    public sınıflar(double x,double y)
    {
        en = x; boy = y;
    }
    public double dortgen_alan_hesaplama()
    {
        return en * boy;
    }
    public double enial()
    {
        return en;
    }
    public void endegistir(double x)
    {
        en=x;
    }
}



