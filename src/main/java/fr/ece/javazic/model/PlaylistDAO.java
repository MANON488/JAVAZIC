package fr.ece.javazic.model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PlaylistDAO {

    private final String nomFichier = "playlists.ser";

    public void sauvegarder(List<Playlist> playlists) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream(nomFichier)
            );
            oos.writeObject(playlists);
            oos.close();
            System.out.println("Playlists sauvegardees.");
        } catch (IOException e) {
            System.out.println("Erreur sauvegarde playlists.");
        }
    }

    public List<Playlist> charger() {
        try {
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(nomFichier)
            );
            List<Playlist> playlists = (List<Playlist>) ois.readObject();
            ois.close();
            return playlists;
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }
}
