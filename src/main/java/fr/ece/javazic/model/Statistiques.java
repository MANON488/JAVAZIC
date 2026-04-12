package fr.ece.javazic.model;

public class Statistiques {

    private int nbUtilisateurs;
    private int nbMorceaux;
    private int nbAlbums;
    private int nbEcoutesTotales;

    public Statistiques() {}

    public void calculer(Catalogue cat) { /* TODO (Omar) */ }
    public void afficher() { /* TODO (Omar) */ }

    public int getNbEcoutesTotales() { return nbEcoutesTotales; }
    public void setNbUtilisateurs(int nb) { this.nbUtilisateurs = nb; }
}
