package fr.ece.javazic.controller;

import fr.ece.javazic.model.Catalogue;
import fr.ece.javazic.model.Visiteur;
import fr.ece.javazic.view.MenuPrincipalView;

public class MainController extends IController {

    private Catalogue catalogue;
    private MenuPrincipalView view;

    public MainController() {
        this.catalogue = new Catalogue();
        this.view = new MenuPrincipalView();
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
                case 5 -> {
                    System.out.println("Au revoir !");
                    continuer = false;
                }
            }
        }
    }

    private void connexionAdmin() {
        // TODO (Marie-Eva)
    }

    private void connexionAbonne() {
        // TODO (Marie-Eva)
    }

    private void creerCompte() {
        // TODO (Marie-Eva)
    }

    private void modeVisiteur() {
        Visiteur v = new Visiteur();
        v.afficherMenu();
        // TODO (Marie-Eva) : boucle menu visiteur
    }

    public static void main(String[] args) {
        new MainController().run();
    }
}
