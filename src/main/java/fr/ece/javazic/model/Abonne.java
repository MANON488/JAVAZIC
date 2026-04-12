package fr.ece.javazic.model;

import java.util.ArrayList;
import java.util.List;

public class Abonne extends Visiteur {

    private boolean suspendu;
    private List<Playlist> playlists;
    private Historique historique;
    private List<Note> notes;

    public Abonne(int id, String nom, String email, String motDePasse) {
        super();
        this.suspendu = false;
        this.playlists = new ArrayList<>();
        this.historique = new Historique();
        this.notes = new ArrayList<>();
    }

    @Override
    public boolean seConnecter(String email, String mdp) {
        if (suspendu) {
            System.out.println("Compte suspendu.");
            return false;
        }
        return super.seConnecter(email, mdp);
    }

    @Override
    public void ecouter(Morceau m) {
        m.incrementerEcoutes();
        historique.ajouterEcoute(m);
        System.out.println("Lecture : " + m.getTitre());
        try { Thread.sleep(m.getDuree() * 1000L); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    }

    public Playlist creerPlaylist(String nom) {
        Playlist p = new Playlist(nom);
        playlists.add(p);
        return p;
    }

    public void supprimerPlaylist(Playlist p) {
        playlists.remove(p);
    }

    public void noter(Morceau m, int valeur, String commentaire) {
        Note n = new Note(valeur, commentaire, m);
        notes.add(n);
    }

    public void modifierNote(Note n, int valeur, String commentaire) {
        n.modifier(valeur, commentaire);
    }

    public void supprimerNote(Note n) {
        notes.remove(n);
    }

    @Override
    public void afficherMenu() {
        System.out.println("=== MENU ABONNÉ — " + getNom() + " ===");
        System.out.println("1. Consulter le catalogue");
        System.out.println("2. Rechercher");
        System.out.println("3. Écouter un morceau (illimité)");
        System.out.println("4. Gérer mes playlists");
        System.out.println("5. Consulter mon historique");
        System.out.println("6. Noter un morceau");
        System.out.println("7. Quitter");
    }

    public boolean isSuspendu() { return suspendu; }
    public void setSuspendu(boolean suspendu) { this.suspendu = suspendu; }
    public List<Playlist> getPlaylists() { return playlists; }
    public Historique getHistorique() { return historique; }
}
