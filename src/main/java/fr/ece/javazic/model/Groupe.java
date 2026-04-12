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

    public void afficherDetails() {
        System.out.println("Groupe : " + nom + " (formé en " + anneeFormation + ")");
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

    public void afficherMembres() {
        System.out.println("Membres de " + nom + " :");
        for (Artiste a : membres) System.out.println("  - " + a.getNom());
    }

    public void ajouterMembre(Artiste a) { membres.add(a); }

    public void interprete(Morceau m) { morceaux.add(m); }

    public int getId() { return id; }
    public String getNom() { return nom; }
    public List<Artiste> getMembres() { return membres; }
    public List<Album> getAlbums() { return albums; }
}
