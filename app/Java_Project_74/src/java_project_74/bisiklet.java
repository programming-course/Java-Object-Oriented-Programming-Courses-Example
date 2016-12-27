/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_74;

/**
 *
 * @author ismailtasdelen
 */
public class bisiklet {
    private int hiz;
    private int vites;
    public double agirlik;
    public double fren;
    private final int artis = 1;
    public bisiklet()
    {
    this.hiz = 3; this.agirlik=7.0;
    }
    public bisiklet(int hiz)
    {
        this.hiz = hiz;
    }
    public bisiklet(int hız, double agirlik)
    {
        this.hiz = hiz;
        this.agirlik = agirlik;
    }
    public void HiziDegistir(int hiz)
    {
        this.hiz = hiz;
    }
    public int HiziAl()
    {
        return this.hiz = hiz;
    }
    public void VitesDegistir(int hiz)
    {
    this.hiz = hiz;
    }
    public int VitesAl()
    {
    return this.hiz;
    }
    public void HiziArtir()
    {
    this.hiz += this.artis;
    }
    public void HiziAzlat()
    {
    this.hiz += this.artis;
    }
    public void VitesArttir()
    {
    this.vites += this.artis;
    }
    public void VitesAzalt()
    {
    this.vites += this.artis;
    }
    public void Kontrol()
    {
    if (this.hiz <4)
    {
       System.out.println("Vites düşürülüyor.");
       VitesAzalt();
    }
    else if (this.hiz >6)
    {
        System.out.println("Vites artırlıyor.");
        VitesArttir();
    }
    }
}
