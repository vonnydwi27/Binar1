package com.example.vonny.binar;

public class Hewan {

    private int kaki;
    private String alatnafas;


    public Hewan()
    {

    }
    public Hewan(String alatnafas, int kaki)
    {
        this.kaki = kaki;
        this.alatnafas = alatnafas;
    }
    public void setKaki(int kaki)
    {
        this.kaki=kaki;
    }
    public void setAlatnafas(String alatnafas)
    {
        this.alatnafas=alatnafas;
    }
    public int getKaki()
    {
        return kaki;
    }
    public String getAlatnafas()
    {
        return alatnafas;
    }

    public void printKaki()
    {
        System.out.print("memiliki"+getKaki()+"kaki");
    }
    public void tampilalatnafas()
    {
        System.out.print("bernafas"+getAlatnafas());
    }

}
