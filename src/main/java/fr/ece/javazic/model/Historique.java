package fr.ece.javazic.model;

import java.util.ArrayList;
import java.util.List;

public class Historique {

    private List<Ecoute> ecoutes;

    public Historique() {
        this.ecoutes = new ArrayList<>();
    }

    public void ajouterEcoute(Morceau m) {
        ecoutes.add(new Ecoute(m));
    }

    public void afficher() {
        System.out.println("=== HISTORIQUE D'ÉCOUTE ===");
        for (Ecoute e : ecoutes) {
            System.out.println(e.getDate() + " — " + e.getMorceau().getTitre());
        }
    }

    public int getNbEcoutes() { return ecoutes.size(); }

    public boolean contient(Morceau m) {
        return ecoutes.stream().anyMatch(e -> e.getMorceau().getId() == m.getId());
    }

    public List<Ecoute> getEcoutes() { return ecoutes; }

    public void vider() { ecoutes.clear(); }
}
