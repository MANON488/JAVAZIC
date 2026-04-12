package fr.ece.javazic.model;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private int id;
    private String nom;
    private String dateCreation;
    private List<Morceau> morceaux;

    public Playlist(String nom) {
        this.nom = nom;
        this.morceaux = new ArrayList<>();
    }

    public void ajouterMorceau(Morceau m) { /* TODO (Man) */ }
    public boolean retirerMorceau(Morceau m) { /* TODO (Man) */ return false; }
    public boolean contient(Morceau m) { /* TODO (Man) */ return false; }
    public void afficher() { /* TODO (Man) */ }
    public void renommer(String nom) { /* TODO (Man) */ }

    public int getId() { return id; }
    public String getNom() { return nom; }
    public List<Morceau> getMorceaux() { return morceaux; }
}
