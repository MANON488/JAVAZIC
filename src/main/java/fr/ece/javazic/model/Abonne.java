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
public void ecouter(Morceau m) {
    if (m != null) { m.incrementerEcoutes(); historique.ajouterEcoute(new Ecoute(m));System.out.println("Lecture du morceau : " + m.getTitre()); }
}

public Playlist creerPlaylist(String nom) {
    Playlist playlist = new Playlist(nom);playlists.add(playlist);return playlist;
}

public void supprimerPlaylist(Playlist p) {
    playlists.remove(p);
}

public void noter(Morceau m, int valeur, String commentaire) {
    if (m != null) { Note note = new Note(m, valeur, commentaire);notes.add(note); }
}

public void modifierNote(Note n, int valeur, String commentaire) {
    if (n != null) { n.setValeur(valeur); n.setCommentaire(commentaire);}
}

public void supprimerNote(Note n) {
    notes.remove(n);
}

    @Override
    public void afficherMenu() {
        System.out.println("\n..... MENU ABONNE .....");
        System.out.println("1. Consulter le catalogue");
        System.out.println("2. Rechercher un morceau");
        System.out.println("3. Creer une playlist");
        System.out.println("4. Voir mes playlists");
        System.out.println("5. Supprimer une playlist");
        System.out.println("6. Consulter l'historique");
        System.out.println("7. Noter un morceau");
        System.out.println("8. Modifier une note");
        System.out.println("9. Supprimer une note");
        System.out.println("10. Quitter");
    }

    public boolean isSuspendu() { return suspendu; }
    public void setSuspendu(boolean suspendu) { this.suspendu = suspendu; }
    public List<Playlist> getPlaylists() { return playlists; }
    public Historique getHistorique() { return historique; }
    public List<Note> getNotes() { return notes; }
}
