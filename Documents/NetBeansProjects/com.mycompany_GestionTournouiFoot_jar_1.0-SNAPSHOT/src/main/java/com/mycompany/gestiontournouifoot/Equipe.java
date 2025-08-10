/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiontournouifoot;
import java.util.* ;

/**
 *
 * @author hp
 */
public class Equipe {
    private String nom;
    private String entraineur;
    private List<String> joueurs; 
    private int points;
    private int diffButs; // Différence de buts

    public Equipe(String nom, String entraineur) {
        this.nom = nom;
        this.entraineur = entraineur;
        this.joueurs = new ArrayList<>();
        this.points = 0;
        this.diffButs = 0;
    }

    // Méthodes
    public void ajouterJoueur(String joueur) {
        joueurs.add(joueur);
    }

    public void mettreAJourPoints(int points, int diffButs) {
        this.points += points;
        this.diffButs += diffButs;
    }

    // Getters et setters
    public String getNom() { return nom; }
    public String getEntraineur() { return entraineur; }
    public int getPoints() { return points; }
    public int getDiffButs() { return diffButs; }
}

