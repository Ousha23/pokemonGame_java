package com.foreach.poo;

import java.util.List;

public class Dresseurs {
    private String nom;
    private List<Pokemon> equipe;

    public Dresseurs(String nom, List<Pokemon> equipe){
        this.nom = nom;
        this.equipe = equipe;
    }

    public Pokemon choisirPokemon(int index){
        return equipe.get(index);
    }

    public boolean estEquipeKo(){
        boolean ko = true;
        for(Pokemon pokemon : equipe){
            if(pokemon.getPointsDeVie()>0){
                ko = false;
                break;
            }
        }
        return ko;
    }

    public String getNom() {
        return nom;
    }

    public List<Pokemon> getEquipe() {
        return equipe;
    }

}
