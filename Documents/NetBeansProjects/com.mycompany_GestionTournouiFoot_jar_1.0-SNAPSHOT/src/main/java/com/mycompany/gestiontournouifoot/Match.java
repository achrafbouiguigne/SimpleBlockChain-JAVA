/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiontournouifoot;

/**
 *
 * @author hp
 */
public class Match {
    
    private Equipe equipe1;
    private Equipe equipe2;
    private int scoreEquipe1;
    private int scoreEquipe2;
    private Arbitre arbitre;

    public Match(Equipe equipe1, Equipe equipe2, Arbitre arbitre) {
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
        this.arbitre = arbitre;
        this.scoreEquipe1 = 0;
        this.scoreEquipe2 = 0;
    }

    public void enregistrerScore(int score1, int score2) {
        this.scoreEquipe1 = score1;
        this.scoreEquipe2 = score2;

        
        if (score1 > score2) {
            equipe1.mettreAJourPoints(3, score1 - score2);
        } else if (score1 < score2) {
            equipe2.mettreAJourPoints(3, score2 - score1);
        } else {
            equipe1.mettreAJourPoints(1, 0);
            equipe2.mettreAJourPoints(1, 0);
        }
    }

    public String getResultat() {
        return equipe1.getNom() + " " + scoreEquipe1 + " - " + scoreEquipe2 + " " + equipe2.getNom();
    }
}


