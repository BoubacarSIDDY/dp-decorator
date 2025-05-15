package sn.isi.decorator;

import sn.isi.composants.Boisson;

// Classe décorateur de base (patron Decorator)
public abstract class Decorateur extends Boisson {
    // La boisson à décorer
    protected Boisson boisson;

    // Prend une boisson en paramètre pour la décorer
    public Decorateur(Boisson boisson) {
        this.boisson = boisson;
    }

    // Retourne la description avec les décorations
    public abstract String getDescription();
}