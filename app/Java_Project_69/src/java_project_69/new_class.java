/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_69;

/**
 *
 * @author ismailtasdelen
 */
public class new_class {
    public double en;
    public double boy;
    public new_class()
    {
        en = 10;
    }
    public new_class(double x)
    {
        en = x;
    }
    public new_class(double x, double y)
    {
        en = x; boy = y;
    }
    public double dortgen_alan_hesapla()
    {
        return en * boy;
    }
}
