/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiontournouifoot;

/**
 *
 * @author hp
 */
public class Arbitre extends Personne {
     private String niveauCertification;
    
    public Arbitre(String nom, int age, String nationalite,String niveauCertification) {
        super(nom, age, nationalite);
        this.niveauCertification= niveauCertification ;
        
    }

    public String getNiveauCertification() {
        return niveauCertification;
    }

    public void setNiveauCertification(String niveauCertification) {
        this.niveauCertification = niveauCertification;
    }

    @Override
    public String toString() {
        return "Arbitre{" + "niveauCertification=" + niveauCertification + '}';
    }
    
    
    
    
    
}
