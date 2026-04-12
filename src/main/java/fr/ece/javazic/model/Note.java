package fr.ece.javazic.model;

import java.time.LocalDate;

public class Note {

    private int valeur;
    private String commentaire;
    private LocalDate date;
    private Morceau morceau;

    public Note(int valeur, String commentaire, Morceau morceau) {
        this.valeur = valeur;
        this.commentaire = commentaire;
        this.morceau = morceau;
    }

    public void modifier(int valeur, String commentaire) { /* TODO (Man) */ }
    public void supprimer() { /* TODO (Man) */ }

    public int getValeur() { return valeur; }
    public String getCommentaire() { return commentaire; }
    public LocalDate getDate() { return date; }
    public Morceau getMorceau() { return morceau; }
}
