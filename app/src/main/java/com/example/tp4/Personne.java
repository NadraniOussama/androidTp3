package com.example.tp4;

import java.io.Serializable;

public class Personne implements Serializable {
    private String nom;
    private String prenom;
    private int age;

    Personne(String nom,String prenom,int age){
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
    }
    public String getNom(){return nom;}
    public String getPrenom(){return prenom;}
    public int getAge(){return age;}

    @Override
    public String toString()
    {
        return "Nom :"+nom+"\t Prenom :"+prenom+"\t Age :"+age;

    }






}
