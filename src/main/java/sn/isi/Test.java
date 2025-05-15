package sn.isi;

import sn.isi.composants.Boisson;
import sn.isi.composants.Espresso;
import sn.isi.decorator.Caramel;
import sn.isi.decorator.Chocolat;
import sn.isi.decorator.Lait;
import sn.isi.decorator.Noisette;

// Classe principale pour tester le pattern Decorator
public class Test {
    public static void main(String[] args) {
        // Crée une boisson de base (Espresso)
        Boisson boisson = new Espresso();
        System.out.println(boisson.getDescription()+" "+boisson.cout());
        System.out.println("-----------");

        // Ajoute du chocolat à la boisson
        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription() + " : " + boisson.cout());
        System.out.println("+++++++++++");

        // Ajoute du lait à la boisson déjà chocolatée
//        boisson = new Lait(boisson);
//        System.out.println(boisson.getDescription() + " : " + boisson.cout());
//        System.out.println("**************");

        // Crée une boisson avec plusieurs décorateurs en une seule ligne
        Boisson boisson1 = new Lait(new Chocolat(new Espresso()));
        System.out.println(boisson1.getDescription()+" -> "+boisson1.cout());
    }
}