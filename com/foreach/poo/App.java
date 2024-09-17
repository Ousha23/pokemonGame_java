package com.foreach.poo;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Pikachu pikachu = new Pikachu("PikachuD1", 150, 5, "Electrique");
        Pikachu pikachuD2 = new Pikachu("PikachuD2", 35, 1, "");
        Bulbizarre bulbizarre = new Bulbizarre("Bulbizarre", 50, 3, "");
        Herbizar herbizar = new Herbizar("Herbizar", 50, 4, "");
        Pokedex pokedexD1 = new Pokedex("PokedexD1", 90, 1, "");
        Pokedex pokedexD2 = new Pokedex("PokedexD2", 90, 2, "");

    
        List<Pokemon> listPokemonDresseur1 = new ArrayList<>();
        listPokemonDresseur1.add(pikachu);
        listPokemonDresseur1.add(herbizar);
        listPokemonDresseur1.add(pokedexD1);

        List<Pokemon> listPokemonDresseur2 = new ArrayList<>();
        listPokemonDresseur2.add(bulbizarre);
        listPokemonDresseur2.add(pikachuD2);
        listPokemonDresseur2.add(pokedexD2);
        

        Dresseurs dresseur1 = new Dresseurs("Toto", listPokemonDresseur1);
        Dresseurs dresseur2 = new Dresseurs("jean", listPokemonDresseur2);

        System.out.println("Dresseur 1 "+ dresseur1.getNom());
        for(Pokemon pok : dresseur1.getEquipe()){
            System.out.println("Dresseur 1 Equipe : " + pok.getName() + " level " + pok.getLevel() + " PV " + pok.getPointsDeVie());
        }

        System.out.println("Dresseur 2 "+ dresseur2.getNom());
        for(Pokemon pok : dresseur2.getEquipe()){
            System.out.println("Dresseur 2 Equipe : "+pok.getName() + " level " + pok.getLevel() + " PV " + pok.getPointsDeVie());
        }

        CombatPokemon combat = new CombatPokemon(dresseur1, dresseur2);
        System.out.println("---------------- Début du Combat : ");
        combat.debutCombat();
    
    }
}
