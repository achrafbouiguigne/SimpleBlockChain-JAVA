/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiontournouifoot;

/**
 *
 * @author hp
 */

  import java.util.ArrayList;
import java.util.List;

public class Groupe {
    private String nom;
    private List<Equipe> equipes;
    private List<Match> matchs;

    public Groupe(String nom) {
        this.nom = nom;
        this.equipes = new ArrayList<>();
        this.matchs = new ArrayList<>();
    }

   

    
}
