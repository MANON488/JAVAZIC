package model;

import java.util.ArrayList;
import java.util.List;

/*
 * Classe métier représentant un album musical dans JAVAZIC.
 *
 * Exemple concret :
 * album = "Night Visions"
 * type = "studio"
 * année = 2012
 *
 * Un album contient plusieurs morceaux.
 * On utilise donc une List<Morceau>.
 */
public class Album {

    /*
     * Identifiant unique de l'album.
     * Sera très utile pour les DAO et la base SQL.
     */
    private int id;

    /*
     * Titre affiché dans le catalogue.
     */
    private String titre;

    /*
     * Année de sortie.
     */
    private int annee;

    /*
     * Type de l’album :
     * - studio
     * - live
     * - compilation
     */
    private String type;

    /*
     * Liste des morceaux présents dans l’album.
     * C’est la relation principale de cette classe.
     */
    private List<Morceau> morceaux;

    /*
     * Constructeur principal.
     *
     * On initialise aussi directement la liste
     * pour éviter les NullPointerException.
     */
    public Album(int id, String titre, int annee, String type) {
        this.id = id;
        this.titre = titre;
        this.annee = annee;
        this.type = type;
        this.morceaux = new ArrayList<>();
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


    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /*
     * =========================
     * MÉTHODES MÉTIER
     * =========================
     */

    /*
     * Ajoute un morceau dans l’album.
     *
     * Utilisé quand :
     * - l’admin crée un album
     * - DAO reconstruit un album depuis SQL
     */
    public void ajouterMorceau(Morceau m) {
        morceaux.add(m);
    }

    /*
     * Retire un morceau de l’album.
     */
    public void retirerMorceau(Morceau m) {
        morceaux.remove(m);
    }

    /*
     * Retourne toute la liste des morceaux.
     *
     * Très utilisé par :
     * - catalogue
     * - vue console
     * - GUI
     */
    public List<Morceau> getMorceaux() {
        return morceaux;
    }

    /*
     * Retourne le nombre total de morceaux.
     *
     * Très pratique pour l’affichage :
     * "Cet album contient 12 morceaux"
     */
    public int getNbMorceaux() {
        return morceaux.size();
    }

    /*
     * Affichage lisible pour le debug et la soutenance.
     */
    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", annee=" + annee +
                ", type='" + type + '\'' +
                ", nbMorceaux=" + getNbMorceaux() +
                '}';
    }
}