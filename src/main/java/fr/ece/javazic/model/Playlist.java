package fr.ece.javazic.model;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class Playlist implements Serializable {
    private int id;
    private String nom;
    private String dateCreation;
    private List<Morceau> morceaux;

    public Playlist(String nom) {
        this.nom = nom;
        this.morceaux = new ArrayList<>();
    }

    public void ajouterMorceau(Morceau m) {
        if (m != null && !morceaux.contains(m)) {
            morceaux.add(m);
        }
    }

    public boolean retirerMorceau(Morceau m) {
        return morceaux.remove(m);
    }

    public boolean contient(Morceau m) {
        return morceaux.contains(m);
    }

    public void afficher() {
        System.out.println("Playlist : " + nom);
        if (morceaux.isEmpty()) {
            System.out.println("Aucun morceau.");
            return;
        }

        for (int i = 0; i < morceaux.size(); i++) {
            System.out.println((i + 1) + ". " + morceaux.get(i).getTitre());
        }
    }

    public void renommer(String nom) {
        if (nom != null && !nom.trim().isEmpty()) {
            this.nom = nom;
        }
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public List<Morceau> getMorceaux() {
        return morceaux;
    }
}
