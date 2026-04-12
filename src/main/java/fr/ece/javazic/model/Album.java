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

    public void afficherDetails() {
        System.out.println("Album : " + titre + " (" + annee + ")");
    }

    public void afficherMorceaux() {
        System.out.println("Morceaux de " + titre + " :");
        for (Morceau m : morceaux) m.afficherDetails();
    }

    public void ajouterMorceau(Morceau m) { morceaux.add(m); }
    public boolean retirerMorceau(Morceau m) { return morceaux.remove(m); }

    public int getId() { return id; }
    public String getTitre() { return titre; }
    public int getAnnee() { return annee; }
    public List<Morceau> getMorceaux() { return morceaux; }
}
