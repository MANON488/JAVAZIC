package fr.ece.javazic.model;

import java.util.ArrayList;
import java.util.List;

public class Artiste {

    private int id;
    private String nom;
    private String biographie;
    private List<Album> albums;
    private List<Morceau> morceaux;

    public Artiste(int id, String nom, String biographie) {
        this.id = id;
        this.nom = nom;
        this.biographie = biographie;
        this.albums = new ArrayList<>();
        this.morceaux = new ArrayList<>();
    }

    public void afficherDetails() {
        System.out.println("Artiste : " + nom);
        System.out.println("Biographie : " + biographie);
    }

    public void afficherDiscographie() {
        System.out.println("Discographie de " + nom + " :");
        for (Album a : albums) a.afficherDetails();
    }

    public void afficherMorceaux() {
        System.out.println("Morceaux de " + nom + " :");
        for (Morceau m : morceaux) m.afficherDetails();
    }

    public void interprete(Morceau m) {
        morceaux.add(m);
    }

    public int getId() { return id; }
    public String getNom() { return nom; }
    public List<Album> getAlbums() { return albums; }
    public List<Morceau> getMorceaux() { return morceaux; }
}
