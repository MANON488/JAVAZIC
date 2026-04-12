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

    public void afficherDetails() { /* TODO (Ludo) */ }
    public void afficherDiscographie() { /* TODO (Ludo) */ }
    public void afficherMorceaux() { /* TODO (Ludo) */ }
    public void interprete(Morceau m) { /* TODO (Ludo) */ }

    public int getId() { return id; }
    public String getNom() { return nom; }
    public List<Album> getAlbums() { return albums; }
    public List<Morceau> getMorceaux() { return morceaux; }
}
