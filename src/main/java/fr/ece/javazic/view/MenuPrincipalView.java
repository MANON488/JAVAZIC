package fr.ece.javazic.view;

public class MenuPrincipalView extends ConsoleView {

    @Override
    public void afficher() {
        System.out.println("=============================");
        System.out.println("       BIENVENUE JAVAZIC     ");
        System.out.println("=============================");
        System.out.println("1. Se connecter en tant qu'administrateur");
        System.out.println("2. Se connecter en tant que client");
        System.out.println("3. Creer un compte client");
        System.out.println("4. Continuer en tant que visiteur");
        System.out.println("5. Quitter");
        System.out.println("=============================");
    }
}
