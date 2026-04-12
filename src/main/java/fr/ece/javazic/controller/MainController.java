package fr.ece.javazic.controller;

import fr.ece.javazic.model.*;
import fr.ece.javazic.view.MenuPrincipalView;

public class MainController extends IController {

    private Catalogue catalogue;
    private MenuPrincipalView view;

    public MainController() {
        this.catalogue = new Catalogue();
        this.view = new MenuPrincipalView();
        chargerDonneesTest();
    }

    @Override
    public void run() {
        boolean continuer = true;
        while (continuer) {
            view.afficher();
            int choix = view.lireChoix(1, 5);
            switch (choix) {
                case 1 -> connexionAdmin();
                case 2 -> connexionAbonne();
                case 3 -> creerCompte();
                case 4 -> modeVisiteur();
                case 5 -> { System.out.println("Au revoir !"); continuer = false; }
            }
        }
    }

    private void connexionAdmin() {
        // TODO : implémenter connexion admin
        System.out.println("Connexion admin — à implémenter");
    }

    private void connexionAbonne() {
        // TODO : implémenter connexion abonné
        System.out.println("Connexion abonné — à implémenter");
    }

    private void creerCompte() {
        // TODO : implémenter création de compte
        System.out.println("Création compte — à implémenter");
    }

    private void modeVisiteur() {
        Visiteur v = new Visiteur();
        v.consulterCatalogue(catalogue);
    }

    private void chargerDonneesTest() {
        Morceau m1 = new Morceau(1, "Bohemian Rhapsody", 354, "Rock");
        Morceau m2 = new Morceau(2, "Stairway to Heaven", 482, "Rock");
        catalogue.ajouter(m1);
        catalogue.ajouter(m2);
        Album a1 = new Album(1, "A Night at the Opera", 1975);
        a1.ajouterMorceau(m1);
        catalogue.ajouter(a1);
    }

    public static void main(String[] args) {
        new MainController().run();
    }
}
