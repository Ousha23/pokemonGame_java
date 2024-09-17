package com.foreach.poo;

public class Pikachu extends Pokemon {

    public Pikachu(String nom, int pv, int level, String type) {
        super(nom, pv, level, type);
    }

    @Override
    public void attaque(Pokemon adversaire) {
        System.out.println(super.getName() + " : Attaque Eclair");
        if(adversaire.getPointsDeVie() <= super.getPointsDeVie()*super.getLevel()){
            adversaire.setPointsDeVie(0); 
        }
        adversaire.setPointsDeVie(getPointsDeVie()- super.getPointsDeVie()*super.getLevel());
    }
    
}
