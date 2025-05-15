package sn.isi.decorator;

import sn.isi.composants.Boisson;

// Decorateur pour ajouter du lait à une boisson
public class Lait extends Decorateur {

    // Prend une boisson en paramètre (à décorer)
    public Lait(Boisson boisson) {
        super(boisson);
    }

    // Ajoute "au lait" à la description
    @Override
    public String getDescription() {
        return boisson.getDescription() + " au lait";
    }

    // Ajoute 150 au coût de la boisson de base
    @Override
    public double cout() {
        return 150 + boisson.cout();
    }
}