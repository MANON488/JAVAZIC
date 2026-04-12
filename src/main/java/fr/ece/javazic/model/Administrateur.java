package fr.ece.javazic.model;

public class Administrateur extends Utilisateur {

    private int niveauAcces;

    public Administrateur(int id, String nom, String email, String motDePasse, int niveauAcces) {
        super(id, nom, email, motDePasse);
        this.niveauAcces = niveauAcces;
    }

    @Override
    public boolean seConnecter(String email, String mdp) {
        return super.seConnecter(email, mdp);
    }

    public void suspendreAbonne(Abonne a) {
        a.setSuspendu(true);
        System.out.println("Compte de " + a.getNom() + " suspendu.");
    }

    public boolean supprimerAbonne(Abonne a, java.util.List<Abonne> listeAbonnes) {
        return listeAbonnes.remove(a);
    }

    public Statistiques consulterStatistiques(Catalogue cat) {
        Statistiques s = new Statistiques();
        s.calculer(cat);
        return s;
    }

    public void afficherStatistiques(Statistiques s) {
        s.afficher();
    }

    public void gererCatalogue(Catalogue cat) {
        cat.afficher();
    }

    @Override
    public void afficherMenu() {
        System.out.println("=== MENU ADMINISTRATEUR ===");
        System.out.println("1. Gérer le catalogue");
        System.out.println("2. Gérer les comptes abonnés");
        System.out.println("3. Consulter les statistiques");
        System.out.println("4. Quitter");
    }
}
