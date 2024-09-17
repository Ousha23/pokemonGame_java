package com.foreach.poo;

public class Bulbizarre extends Pokemon{

    public Bulbizarre(String name, int pv, int level, String type) {
        super(name, pv, level, type);
    }

    @Override
    public void attaque(Pokemon adversaire) {
        System.out.println(super.getName() +" : Attaque Fouet Lianes");
        if(adversaire.getPointsDeVie() <= super.getPointsDeVie()*super.getLevel()){
            adversaire.setPointsDeVie(0); 
        }
        adversaire.setPointsDeVie(getPointsDeVie()- super.getPointsDeVie()*super.getLevel());
    }    
}
