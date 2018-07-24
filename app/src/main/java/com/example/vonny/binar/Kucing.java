package com.example.vonny.binar;

public class Kucing extends Hewan{

    public Kucing()
    {
        setKaki(4);
        setAlatnafas("paru2");
    }

    @Override
    public void printKaki()
    {
        System.out.print("Kucing");
        super.printKaki();
    }

}
