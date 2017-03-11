/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_71;

/**
 *
 * @author ismailtasdelen
 */
public class dortgen {
    private double en;
    public double boy;
    public dortgen()
    {
    this.boy=10;
    }
    public dortgen(double en, double boy)
    {
    this.en=en; this.boy=boy;
    }
    public double dortgen_alan_hesapla()
    {
    return en * boy;
    }
    public double enial()
    {
    return en;
    }
    public void endegistir(double en)
    {
    this.en=en;
    }
}
