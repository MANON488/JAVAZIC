package fr.ece.javazic.model;

public class Visiteur extends Utilisateur {

    private int nbEcoutesSession;
    private static final int MAX_ECOUTES = 5;

    public Visiteur() {
        super(0, "Visiteur", "", "");
        this.nbEcoutesSession = 0;
    }

    public void ecouter(Morceau m) {
        if (peutEcouter()) {
            m.incrementerEcoutes();
            nbEcoutesSession++;
            System.out.println("Lecture : " + m.getTitre());
            try {
                Thread.sleep(m.getDuree() * 1000L);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        } else {
            System.out.println("Limite de " + MAX_ECOUTES + " ecoutes atteinte. Creez un compte pour continuer.");
        }
    }

    public boolean peutEcouter() {
        return nbEcoutesSession < MAX_ECOUTES;
    }

    public void consulterCatalogue(Catalogue cat) {
        cat.afficher();
    }

    @Override
    public void afficherMenu() {
        System.out.println("=== MENU VISITEUR ===");
        System.out.println("1. Consulter le catalogue");
        System.out.println("2. Rechercher");
        System.out.println("3. Ecouter un morceau (" + nbEcoutesSession + "/" + MAX_ECOUTES + ")");
        System.out.println("4. Creer un compte");
        System.out.println("5. Se connecter");
        System.out.println("6. Quitter");
    }

    public int getNbEcoutesSession() { return nbEcoutesSession; }
    public static int getMaxEcoutes() { return MAX_ECOUTES; }
}
