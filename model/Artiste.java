package model;

import java.util.ArrayList;
import java.util.List;

/*
 * Classe métier représentant un artiste solo.
 *
 * Exemple :
 * - The Weeknd
 * - Dua Lipa
 * - David Guetta
 *
 * Un artiste possède :
 * - des informations personnelles
 * - une liste d'albums
 * - éventuellement un groupe
 */
public class Artiste {

    /*
     * Identifiant unique.
     * Utile pour DAO et SQL.
     */
    private int id;

    /*
     * Nom de l'artiste affiché dans le catalogue.
     */
    private String nom;

    /*
     * Petit texte descriptif.
     * Affiché dans la fiche artiste.
     */
    private String biographie;

    /*
     * Liste des albums de l'artiste.
     */
    private List<Album> albums;

    /*
     * Groupe auquel l'artiste appartient.
     * Peut être null si artiste solo.
     */
    private Groupe groupe;

    /*
     * Constructeur principal.
     *
     * On initialise directement la liste
     * pour éviter les erreurs null.
     */
    public Artiste(int id, String nom, String biographie) {
        this.id = id;
        this.nom = nom;
        this.biographie = biographie;
        this.albums = new ArrayList<>();
        this.groupe = null;
    }

    /*
     * =========================
     * GETTERS / SETTERS
     * =========================
     */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getBiographie() {
        return biographie;
    }

    public void setBiographie(String biographie) {
        this.biographie = biographie;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    /*
     * =========================
     * MÉTHODES MÉTIER
     * =========================
     */

    /*
     * Retourne tous les albums de l'artiste.
     *
     * Utilisé pour :
     * - navigation catalogue
     * - vue fiche artiste
     * - recommandations
     */
    public List<Album> getAlbums() {
        return albums;
    }

    /*
     * Méthode pratique pour ajouter un album.
     *
     * Même si ce n’est pas explicitement demandé,
     * elle sera très utile pour l’admin et les DAO.
     */
    public void ajouterAlbum(Album album) {
        albums.add(album);
    }

    /*
     * Affichage lisible pour debug / soutenance.
     */
    @Override
    public String toString() {
        return "Artiste{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbAlbums=" + albums.size() +
                ", groupe=" + (groupe != null ? groupe.getNom() : "solo") +
                '}';
    }
}