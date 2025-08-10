/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiontournouifoot;

/**
 *
 * @author hp
 */
public class Joueur extends Personne {
    private String position; 
    private int buts;
    
    public Joueur(String nom, int age, String nationalite) {
        super(nom, age, nationalite);
        this.position = position;
        this.buts=buts ;
    }
    
    public void marquerBut() {
        this.buts++;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getButs() {
        return buts;
    }

    public void setButs(int buts) {
        this.buts = buts;
    }

    @Override
    public String toString() {
        return "Joueur{" + "position=" + position + ", buts=" + buts + '}';
    }
    
    
}
