package fr.ece.javazic.model;

public class Morceau {

    private int id;
    private String titre;
    private int duree;
    private String genre;
    private int nbEcoutes;

    public Morceau(int id, String titre, int duree, String genre) {
        this.id = id;
        this.titre = titre;
        this.duree = duree;
        this.genre = genre;
        this.nbEcoutes = 0;
    }

    public void incrementerEcoutes() { /* TODO (Ludo) */ }
    public void afficherDetails() { /* TODO (Ludo) */ }

    public int getId() { return id; }
    public String getTitre() { return titre; }
    public int getDuree() { return duree; }
    public String getGenre() { return genre; }
    public int getNbEcoutes() { return nbEcoutes; }
}
