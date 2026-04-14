
package model;
/*
 * Cette classe représente l'entité métier "Morceau" dans JAVAZIC.
 *
 * Dans le projet, elle modélise une musique du catalogue :
 * - visible par le visiteur
 * - ajoutable dans une playlist
 * - consultable par l'admin
 * - utilisée dans les statistiques
 *
 * Elle appartient à la couche Model du MVC :
 * elle ne contient AUCUN affichage et aucune saisie utilisateur.
 */
public class Morceau {

    /*
     * Identifiant unique du morceau.
     * Très utile pour :
     * - les DAO
     * - la base SQL
     * - les recherches précises
     * - éviter les doublons
     */
    private int id;

    /*
     * Nom du morceau affiché dans le catalogue.
     * Exemple : "Believer"
     */
    private String titre;

    /*
     * Durée du morceau en secondes.
     * On stocke en brut pour faciliter :
     * - les calculs
     * - les statistiques
     * - le formatage mm:ss
     */
    private int duree;

    /*
     * Genre musical.
     * Sera utilisé dans :
     * - la recherche par genre
     * - les filtres
     * - les recommandations
     */
    private String genre;

    /*
     * Année de sortie du morceau.
     * Utile pour les tris et extensions futures.
     */
    private int annee;

    /*
     * Nombre total d'écoutes.
     * Important pour :
     * - statistiques simples
     * - statistiques évoluées
     * - recommandations
     */
    private int nbEcoutes;

    /*
     * Constructeur principal.
     *
     * Il initialise complètement l'objet dès sa création.
     * C'est parfait pour :
     * - les DAO
     * - les tests JUnit
     * - la création rapide d'objets métier
     */
    public Morceau(int id, String titre, int duree, String genre, int annee, int nbEcoutes) {
        this.id = id;
        this.titre = titre;
        this.duree = duree;
        this.genre = genre;
        this.annee = annee;
        this.nbEcoutes = nbEcoutes;
    }

    /*
     * =========================
     * GETTERS ET SETTERS
     * =========================
     *
     * Encapsulation = très important en POO.
     * Les attributs restent privés.
     * Le reste du programme passe par ces méthodes.
     */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        /*
         * Permet de modifier l'id si nécessaire,
         * par exemple après insertion en base.
         */
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getNbEcoutes() {
        return nbEcoutes;
    }

    public void setNbEcoutes(int nbEcoutes) {
        this.nbEcoutes = nbEcoutes;
    }

    /*
     * =========================
     * MÉTHODES MÉTIER
     * =========================
     */

    /*
     * Incrémente le nombre d'écoutes de 1.
     *
     * Cette méthode sera appelée quand :
     * - un visiteur écoute un morceau
     * - un abonné lance une lecture
     * - la lecture se termine
     *
     * Très utile pour les statistiques du projet.
     */
    public void incrementerEcoutes() {
        nbEcoutes++;
    }

    /*
     * Retourne la durée au format mm:ss.
     *
     * Exemple :
     * 125 secondes -> 02:05
     * 61 secondes -> 01:01
     *
     * Très utile pour l'affichage console et GUI.
     */
    public String getDureeFormatee() {
        int minutes = duree / 60;
        int secondes = duree % 60;

        /*
         * %02d :
         * toujours 2 chiffres
         * ajoute 0 devant si nécessaire
         */
        return String.format("%02d:%02d", minutes, secondes);
    }

    /*
     * Méthode pratique pour le debug et la soutenance.
     *
     * Quand on affiche un objet Morceau,
     * on obtient un rendu lisible.
     */
    @Override
    public String toString() {
        return "Morceau{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", duree=" + getDureeFormatee() +
                ", genre='" + genre + '\'' +
                ", annee=" + annee +
                ", nbEcoutes=" + nbEcoutes +
                '}';
    }
}