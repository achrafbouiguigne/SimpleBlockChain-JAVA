/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiontournouifoot;

/**
 *
 * @author hp
 */
public class Personne {
    private String nom;
    private int age;
    private String nationalite;

    public Personne(String nom, int age, String nationalite) {
        this.nom = nom;
        this.age = age;
        this.nationalite = nationalite;
    }

    // Getters et setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Âge: " + age + ", Nationalité: " + nationalite;
    
}
}
