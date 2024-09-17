package com.foreach.poo;

public abstract class Pokemon{
    private String name;
    private int pointsDeVie;
    private int level;
    private String type;

    public String getType() {
        return type;
    }

    public Pokemon(String name, int pointsDeVie, int level, String type){
        this.name = name;
        this.pointsDeVie = pointsDeVie;
        this.level = level;
        this.type = type;
    }

    public abstract void attaque(Pokemon adversaire);

    public void afficherEtat(){
        System.out.println("Niveau : " + this.getLevel());
        System.out.println("Points de vie : " + this.getPointsDeVie());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}