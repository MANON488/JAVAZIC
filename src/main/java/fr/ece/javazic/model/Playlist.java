package fr.ece.javazic.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private int id;
    private String nom;
    private LocalDate dateCreation;
    private List<Morceau> morceaux;
    private static int compteur = 0;

    public Playlist(String nom) {
        this.id = ++compteur;
        this.nom = nom;
        this.dateCreation = LocalDate.now();
        this.morceaux = new ArrayList<>();
    }

    public void ajouterMorceau(Morceau m) { morceaux.add(m); }

    public boolean retirerMorceau(Morceau m) { return morceaux.remove(m); }

    public boolean contient(Morceau m) { return morceaux.contains(m); }

    public void afficher() {
        System.out.println("Playlist : " + nom + " (créée le " + dateCreation + ")");
        morceaux.forEach(Morceau::afficherDetails);
    }

    public void renommer(String nouveauNom) { this.nom = nouveauNom; }

    public int getId() { return id; }
    public String getNom() { return nom; }
    public List<Morceau> getMorceaux() { return morceaux; }
}
