package model;

import java.util.ArrayList;
import java.util.List;

/*
 * Classe métier représentant un groupe musical.
 *
 * Exemples :
 * - Coldplay
 * - Imagine Dragons
 * - Daft Punk
 *
 * Un groupe possède :
 * - plusieurs artistes (membres)
 * - plusieurs albums
 */
public class Groupe {

    /*
     * Identifiant unique du groupe.
     */
    private int id;

    /*
     * Nom affiché dans le catalogue.
     */
    private String nom;

    /*
     * Biographie / description du groupe.
     */
    private String biographie;

    /*
     * Année de création du groupe.
     */
    private int anneeFormation;

    /*
     * Liste des membres du groupe.
     */
    private List<Artiste> membres;

    /*
     * Liste des albums du groupe.
     */
    private List<Album> albums;

    /*
     * Constructeur principal.
     *
     * On initialise directement les listes.
     */
    public Groupe(int id, String nom, String biographie, int anneeFormation) {
        this.id = id;
        this.nom = nom;
        this.biographie = biographie;
        this.anneeFormation = anneeFormation;
        this.membres = new ArrayList<>();
        this.albums = new ArrayList<>();
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

    public int getAnneeFormation() {
        return anneeFormation;
    }

    public void setAnneeFormation(int anneeFormation) {
        this.anneeFormation = anneeFormation;
    }

    /*
     * =========================
     * MÉTHODES MÉTIER
     * =========================
     */

    /*
     * Retourne la liste des membres.
     *
     * Utilisé pour :
     * - fiche groupe
     * - navigation catalogue
     * - GUI
     */
    public List<Artiste> getMembres() {
        return membres;
    }

    /*
     * Retourne la liste des albums.
     */
    public List<Album> getAlbums() {
        return albums;
    }

    /*
     * Ajoute un membre au groupe.
     *
     * Très utile pour :
     * - admin
     * - DAO
     * - création de données de test
     */
    public void ajouterMembre(Artiste artiste) {
        membres.add(artiste);

        /*
         * Très intelligent :
         * on relie automatiquement l’artiste au groupe.
         * Comme ça la navigation marche dans les 2 sens.
         */
        artiste.setGroupe(this);
    }

    /*
     * Ajoute un album au groupe.
     */
    public void ajouterAlbum(Album album) {
        albums.add(album);
    }

    /*
     * Affichage lisible.
     */
    @Override
    public String toString() {
        return "Groupe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", anneeFormation=" + anneeFormation +
                ", nbMembres=" + membres.size() +
                ", nbAlbums=" + albums.size() +
                '}';
    }
}