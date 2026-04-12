package fr.ece.javazic.model;

import java.util.List;

public class Administrateur extends Utilisateur {

    private int niveauAcces;

    public Administrateur(int id, String nom, String email, String motDePasse, int niveauAcces) {
        super(id, nom, email, motDePasse);
        this.niveauAcces = niveauAcces;
    }

    // Marie-Eva — authentification
    public boolean seConnecter(String email, String mdp) {
        return getEmail().equals(email) && getMotDePasse().equals(mdp);
    }

    public void suspendreAbonne(Abonne a) { /* TODO (Omar) */ }
    public boolean supprimerAbonne(Abonne a, List<Abonne> liste) { /* TODO (Omar) */ return false; }
    public Statistiques consulterStatistiques(Catalogue cat) { /* TODO (Omar) */ return null; }
    public void afficherStatistiques(Statistiques s) { /* TODO (Omar) */ }
    public void gererCatalogue(Catalogue cat) { /* TODO (Omar) */ }

    @Override
    public void afficherMenu() { /* TODO (Omar) */ }

    public int getNiveauAcces() { return niveauAcces; }
}
