package fr.ece.javazic.view;

import fr.ece.javazic.model.Abonne;
import fr.ece.javazic.model.Playlist;

public class AbonneView extends ConsoleView {
 
    public void menuPlaylists(Abonne abonne) {
        boolean continuer = true;

        while (continuer) {
            System.out.println("\n===== GESTION PLAYLISTS =====");
            System.out.println("1. Creer une playlist");
            System.out.println("2. Afficher mes playlists");
            System.out.println("3. Supprimer une playlist");
            System.out.println("4. Retour");

            int choix = lireChoix(1, 4);

            switch (choix) {
                case 1:
                    String nom = lireTexte("Nom de la playlist");
                    abonne.creerPlaylist(nom);
                    afficherSucces("Playlist creee avec succes");
                    break;

                case 2:
                    if (abonne.getPlaylists().isEmpty()) {
                        afficherErreur("Aucune playlist");
                    } else {
                        for (Playlist p : abonne.getPlaylists()) {
                            p.afficher();
                        }
                    }
                    break;

                case 3:
                    if (abonne.getPlaylists().isEmpty()) {
                        afficherErreur("Aucune playlist a supprimer");
                    } else {
                        for (int i = 0; i < abonne.getPlaylists().size(); i++) {
                            System.out.println((i + 1) + ". " + abonne.getPlaylists().get(i).getNom());
                        }

                        int index = lireChoix(1, abonne.getPlaylists().size()) - 1;
                        Playlist playlist = abonne.getPlaylists().get(index);
                        abonne.supprimerPlaylist(playlist);
                        afficherSucces("Playlist supprimee");
                    }
                    break;

                case 4:
                    continuer = false;
                    break;
            }
        }
    }
}

