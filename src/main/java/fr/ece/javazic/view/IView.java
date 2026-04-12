package fr.ece.javazic.view;

public interface IView {
    void afficher();
    void afficherErreur(String message);
    void afficherSucces(String message);
}
