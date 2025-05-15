package sn.isi.decorator;

import sn.isi.composants.Boisson;

public class Noisette extends Decorateur{
    public Noisette(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " au noisette";
    }

    @Override
    public double cout() {
        return boisson.cout() + 500;
    }
}
