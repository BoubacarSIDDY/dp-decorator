package sn.isi.decorator;

import sn.isi.composants.Boisson;

public class Chocolat extends Decorateur{
    public Chocolat(Boisson boisson) {
        super(boisson);
    }
    @Override
    public String getDescription() {
        return boisson.getDescription() + " au chocolat";
    }

    @Override
    public double cout() {
        return 100 + boisson.cout();
    }
}
