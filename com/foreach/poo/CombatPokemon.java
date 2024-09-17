package com.foreach.poo;

import java.util.List;
import java.util.Random;

public class CombatPokemon {
    private Dresseurs dresseur1;
    private Dresseurs dresseur2;

    public CombatPokemon(Dresseurs dresseur1, Dresseurs dresseur2){
        this.dresseur1 = dresseur1;
        this.dresseur2 = dresseur2;
    }

    public void debutCombat(){        
        int tour = (new Random()).nextInt(2);
        while (!dresseur1.estEquipeKo() && !dresseur2.estEquipeKo()) {
            // dresseur 1 choix pokemon
            Pokemon pokDresseur1 = dresseur1.choisirPokemon(choixIndexPokemon(dresseur1.getEquipe()));

            // dresseur 2 choix pokemon
            Pokemon pokDresseur2 = dresseur2.choisirPokemon(choixIndexPokemon(dresseur2.getEquipe()));
            if(tour == 0){
                pokDresseur1.attaque(pokDresseur2);
                if(pokDresseur2.getPointsDeVie() == 0){
                    System.out.println(pokDresseur2.getName()+ " est KO!");
                }
                tour = 1;
            } else {
                pokDresseur2.attaque(pokDresseur1);
                if(pokDresseur1.getPointsDeVie()==0){
                    System.out.println(pokDresseur1.getName()+ " est KO!");
                }
                tour = 0;
            }
        }
        if (dresseur1.estEquipeKo()) {
            System.out.println(dresseur1.getNom() + " a gagné !");
        } else {
            System.out.println(dresseur2.getNom() + " a gagné !");
        }
    }

    private int choixIndexPokemon(List<Pokemon> equipe){
        int indexPokemon = 0;
        for(int i = 0; i< equipe.size(); i++){
            if(equipe.get(i).getPointsDeVie() > 0){
                indexPokemon = i;
                break;
            }
        }
        return indexPokemon;  
    }

}
