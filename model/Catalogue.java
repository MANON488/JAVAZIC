package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Classe centrale du catalogue musical de JAVAZIC.
 *
 * Cette classe contient l’ensemble des données du catalogue :
 * - morceaux
 * - albums
 * - artistes
 * - groupes
 *
 * Son rôle principal :
 * offrir des méthodes de recherche utilisées
 * par les visiteurs, abonnés et administrateurs.
 *
 * Très importante dans le MVC :
 * elle appartient à la couche Model.
 */
public class Catalogue {

    /*
     * Liste complète des morceaux du catalogue.
     */
    private List<Morceau> morceaux;

    /*
     * Liste complète des albums.
     */
    private List<Album> albums;

    /*
     * Liste complète des artistes.
     */
    private List<Artiste> artistes;

    /*
     * Liste complète des groupes.
     */
    private List<Groupe> groupes;

    /*
     * Constructeur principal.
     *
     * Initialise toutes les collections.
     * Très important pour éviter les erreurs null.
     */
    public Catalogue() {
        this.morceaux = new ArrayList<>();
        this.albums = new ArrayList<>();
        this.artistes = new ArrayList<>();
        this.groupes = new ArrayList<>();
    }

    /*
     * =========================
     * GETTERS
     * =========================
     *
     * Très utiles pour :
     * - DAO
     * - contrôleurs
     * - vues
     * - données de test
     */

    public List<Morceau> getMorceaux() {
        return morceaux;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public List<Artiste> getArtistes() {
        return artistes;
    }

    public List<Groupe> getGroupes() {
        return groupes;
    }

    /*
     * =========================
     * MÉTHODES D’AJOUT
     * =========================
     *
     * Très utiles pour :
     * - DAO
     * - admin
     * - jeux de tests
     */

    public void ajouterMorceau(Morceau morceau) {
        morceaux.add(morceau);
    }

    public void ajouterAlbum(Album album) {
        albums.add(album);
    }

    public void ajouterArtiste(Artiste artiste) {
        artistes.add(artiste);
    }

    public void ajouterGroupe(Groupe groupe) {
        groupes.add(groupe);
    }

    /*
     * =========================
     * MÉTHODES DE RECHERCHE
     * =========================
     */

    /*
     * Recherche tous les morceaux dont le titre
     * contient la chaîne saisie.
     *
     * Recherche insensible à la casse.
     *
     * Exemple :
     * "bel" -> Believer
     */
    public List<Morceau> rechercherParTitre(String titre) {
        return morceaux.stream()
                .filter(m -> m.getTitre().toLowerCase().contains(titre.toLowerCase()))
                .collect(Collectors.toList());
    }

    /*
     * Recherche les artistes par nom.
     */
    public List<Artiste> rechercherParArtiste(String nom) {
        return artistes.stream()
                .filter(a -> a.getNom().toLowerCase().contains(nom.toLowerCase()))
                .collect(Collectors.toList());
    }

    /*
     * Recherche les albums par titre.
     */
    public List<Album> rechercherParAlbum(String titre) {
        return albums.stream()
                .filter(a -> a.getTitre().toLowerCase().contains(titre.toLowerCase()))
                .collect(Collectors.toList());
    }

    /*
     * Recherche les morceaux selon leur genre.
     */
    public List<Morceau> rechercherParGenre(String genre) {
        return morceaux.stream()
                .filter(m -> m.getGenre().toLowerCase().contains(genre.toLowerCase()))
                .collect(Collectors.toList());
    }

    /*
     * Affichage utile pour debug / soutenance.
     */
    @Override
    public String toString() {
        return "Catalogue{" +
                "morceaux=" + morceaux.size() +
                ", albums=" + albums.size() +
                ", artistes=" + artistes.size() +
                ", groupes=" + groupes.size() +
                '}';
    }
}