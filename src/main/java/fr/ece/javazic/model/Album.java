package fr.ece.javazic.model;

import java.util.ArrayList;
import java.util.List;

public class Album {

    private int id;
    private String titre;
    private int annee;
    private List<Morceau> morceaux;

    public Album(int id, String titre, int annee) {
        this.id = id;
        this.titre = titre;
        this.annee = annee;
        this.morceaux = new ArrayList<>();
    }

    public void afficherDetails() { /* TODO (Ludo) */ }
    public void afficherMorceaux() { /* TODO (Ludo) */ }
    public void ajouterMorceau(Morceau m) { /* TODO (Ludo) */ }
    public boolean retirerMorceau(Morceau m) { /* TODO (Ludo) */ return false; }

    public int getId() { return id; }
    public String getTitre() { return titre; }
    public int getAnnee() { return annee; }
    public List<Morceau> getMorceaux() { return morceaux; }
}
