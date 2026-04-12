package fr.ece.javazic.model;

public class Statistiques {

    private int nbUtilisateurs;
    private int nbMorceaux;
    private int nbAlbums;
    private int nbEcoutesTotales;

    public Statistiques() {}

    public void calculer(Catalogue cat) {
        this.nbMorceaux = cat.getMorceaux().size();
        this.nbAlbums = cat.getAlbums().size();
        this.nbEcoutesTotales = cat.getMorceaux().stream().mapToInt(Morceau::getNbEcoutes).sum();
    }

    public void afficher() {
        System.out.println("=== STATISTIQUES ===");
        System.out.println("Utilisateurs : " + nbUtilisateurs);
        System.out.println("Morceaux : " + nbMorceaux);
        System.out.println("Albums : " + nbAlbums);
        System.out.println("Écoutes totales : " + nbEcoutesTotales);
    }

    public int getNbEcoutesTotales() { return nbEcoutesTotales; }
    public void setNbUtilisateurs(int nb) { this.nbUtilisateurs = nb; }
}
