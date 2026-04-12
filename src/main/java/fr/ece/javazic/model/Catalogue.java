package fr.ece.javazic.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Catalogue {

    private List<Morceau> morceaux;
    private List<Album> albums;
    private List<Artiste> artistes;
    private List<Groupe> groupes;

    public Catalogue() {
        this.morceaux = new ArrayList<>();
        this.albums = new ArrayList<>();
        this.artistes = new ArrayList<>();
        this.groupes = new ArrayList<>();
    }

    public List<Object> rechercher(String critere, String valeur) { /* TODO (Ludo) */ return new ArrayList<>(); }
    public void ajouter(Object element) { /* TODO (Ludo) */ }
    public boolean supprimer(int id) { /* TODO (Ludo) */ return false; }
    public void afficher() { /* TODO (Ludo) */ }
    public List<Object> rechercheAvancee(Map<String, String> filtres) { /* TODO (Ludo) */ return new ArrayList<>(); }
    public List<Morceau> trier(String critere) { /* TODO (Ludo) */ return morceaux; }

    public List<Morceau> getMorceaux() { return morceaux; }
    public List<Album> getAlbums() { return albums; }
    public List<Artiste> getArtistes() { return artistes; }
    public List<Groupe> getGroupes() { return groupes; }
}
