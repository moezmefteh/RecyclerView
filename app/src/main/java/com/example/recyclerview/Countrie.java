package com.example.recyclerview;

public class Countrie {
    private int iconID;
    private String nom;

    public Countrie( int iconID,String nom) {
        this.nom = nom;
        this.iconID = iconID;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getIconID() {
        return iconID;
    }

    public void setIconID(int iconID) {
        this.iconID = iconID;
    }


}
