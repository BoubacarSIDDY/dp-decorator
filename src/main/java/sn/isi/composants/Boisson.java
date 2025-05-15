package sn.isi.composants;

// Classe abstraite pour les boissons
public abstract class Boisson {
    // Description de la boisson
    protected String description;

    // Retourne la description
    public String getDescription() {
        return description;
    }

    // Méthode abstraite pour calculer le coût
    public abstract double cout();
}