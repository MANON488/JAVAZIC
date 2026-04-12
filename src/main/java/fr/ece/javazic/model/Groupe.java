package fr.ece.javazic.model;

import java.util.ArrayList;
import java.util.List;

public class Groupe {

    private int id;
    private String nom;
    private String biographie;
    private int anneeFormation;
    private List<Artiste> membres;
    private List<Album> albums;
    private List<Morceau> morceaux;

    public Groupe(int id, String nom, String biographie, int anneeFormation) {
        this.id = id;
        this.nom = nom;
        this.biographie = biographie;
        this.anneeFormation = anneeFormation;
        this.membres = new ArrayList<>();
        this.albums = new ArrayList<>();
        this.morceaux = new ArrayList<>();
    }

    public void afficherDetails() { /* TODO (Ludo) */ }
    public void afficherDiscographie() { /* TODO (Ludo) */ }
    public void afficherMorceaux() { /* TODO (Ludo) */ }
    public void afficherMembres() { /* TODO (Ludo) */ }
    public void ajouterMembre(Artiste a) { /* TODO (Ludo) */ }
    public void interprete(Morceau m) { /* TODO (Ludo) */ }

    public int getId() { return id; }
    public String getNom() { return nom; }
    public List<Artiste> getMembres() { return membres; }
    public List<Album> getAlbums() { return albums; }
    public List<Morceau> getMorceaux() { return morceaux; }
}
