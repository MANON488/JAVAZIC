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

    // Marie-Eva — authentification
    public boolean seConnecter(String email, String mdp) {
        if (suspendu) { System.out.println("Compte suspendu."); return false; }
        return getEmail().equals(email) && getMotDePasse().equals(mdp);
    }

    @Override
    public void ecouter(Morceau m) { /* TODO (Man) */ }
    public Playlist creerPlaylist(String nom) { /* TODO (Man) */ return null; }
    public void supprimerPlaylist(Playlist p) { /* TODO (Man) */ }
    public void noter(Morceau m, int valeur, String commentaire) { /* TODO (Man) */ }
    public void modifierNote(Note n, int valeur, String commentaire) { /* TODO (Man) */ }
    public void supprimerNote(Note n) { /* TODO (Man) */ }

    @Override
    public void afficherMenu() { /* TODO (Man) */ }

    public boolean isSuspendu() { return suspendu; }
    public void setSuspendu(boolean suspendu) { this.suspendu = suspendu; }
    public List<Playlist> getPlaylists() { return playlists; }
    public Historique getHistorique() { return historique; }
    public List<Note> getNotes() { return notes; }
}
