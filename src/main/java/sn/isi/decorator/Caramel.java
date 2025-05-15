package sn.isi.decorator;

import sn.isi.composants.Boisson;

public class Caramel extends Decorateur{
    public Caramel(Boisson boisson){
        super(boisson);
    }
    public String getDescription(){
        return boisson.getDescription() + " au caramel";
    }
    public double cout(){
        return 200 + boisson.cout();
    }
}
