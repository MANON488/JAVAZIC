package fr.ece.javazic.view;

import java.util.Scanner;

public abstract class ConsoleView implements IView {

    protected Scanner scanner;

    public ConsoleView() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void afficherErreur(String message) {
        System.out.println("[ERREUR] " + message);
    }

    @Override
    public void afficherSucces(String message) {
        System.out.println("[OK] " + message);
    }

    public int lireChoix(int min, int max) {
        int choix = -1;
        while (choix < min || choix > max) {
            System.out.print("Votre choix (" + min + "-" + max + ") : ");
            try {
                choix = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                afficherErreur("Entrez un nombre entre " + min + " et " + max);
            }
        }
        return choix;
    }

    public String lireTexte(String invite) {
        System.out.print(invite + " : ");
        return scanner.nextLine().trim();
    }
}
