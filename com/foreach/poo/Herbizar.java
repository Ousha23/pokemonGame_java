package com.foreach.poo;

public class Herbizar extends Pokemon {
    public Herbizar(String nom, int pv, int level, String type) {
        super(nom, pv, level, type);
    }

    @Override
    public void attaque(Pokemon adversaire) {
        System.out.println(super.getName() + " : Attaque Herbes");
        if(adversaire.getPointsDeVie() <= super.getPointsDeVie()*super.getLevel()){
            adversaire.setPointsDeVie(0); 
        }
        adversaire.setPointsDeVie(getPointsDeVie()- super.getPointsDeVie()*super.getLevel());
    }
    
}
