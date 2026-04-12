package fr.ece.javazic.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Catalogue {

    private List<Morceau> morceaux;
    private List<Album> albums;
    private List<Artiste> artistes;
    private List<Groupe> groupes;

    public Catalogue() {
        this.morceaux = new ArrayList<>();
        this.albums = new ArrayList<>();
        this.artistes = new ArrayList<>();
        this.groupes = new ArrayList<>();
    }

    public List<Object> rechercher(String critere, String valeur) {
        List<Object> resultats = new ArrayList<>();
        String v = valeur.toLowerCase();
        switch (critere.toLowerCase()) {
            case "titre" -> morceaux.stream().filter(m -> m.getTitre().toLowerCase().contains(v)).forEach(resultats::add);
            case "album" -> albums.stream().filter(a -> a.getTitre().toLowerCase().contains(v)).forEach(resultats::add);
            case "artiste" -> artistes.stream().filter(a -> a.getNom().toLowerCase().contains(v)).forEach(resultats::add);
            case "groupe" -> groupes.stream().filter(g -> g.getNom().toLowerCase().contains(v)).forEach(resultats::add);
            case "genre" -> morceaux.stream().filter(m -> m.getGenre().toLowerCase().contains(v)).forEach(resultats::add);
        }
        return resultats;
    }

    public void ajouter(Object element) {
        if (element instanceof Morceau m) morceaux.add(m);
        else if (element instanceof Album a) albums.add(a);
        else if (element instanceof Artiste a) artistes.add(a);
        else if (element instanceof Groupe g) groupes.add(g);
    }

    public boolean supprimer(int id) {
        boolean found = morceaux.removeIf(m -> m.getId() == id);
        if (!found) found = albums.removeIf(a -> a.getId() == id);
        if (!found) found = artistes.removeIf(a -> a.getId() == id);
        if (!found) found = groupes.removeIf(g -> g.getId() == id);
        return found;
    }

    public void afficher() {
        System.out.println("=== CATALOGUE ===");
        System.out.println("--- Morceaux ---");
        morceaux.forEach(Morceau::afficherDetails);
        System.out.println("--- Albums ---");
        albums.forEach(Album::afficherDetails);
        System.out.println("--- Artistes ---");
        artistes.forEach(Artiste::afficherDetails);
        System.out.println("--- Groupes ---");
        groupes.forEach(Groupe::afficherDetails);
    }

    public List<Object> rechercheAvancee(java.util.Map<String, String> filtres) {
        List<Object> resultats = new ArrayList<>();
        filtres.forEach((critere, valeur) -> resultats.addAll(rechercher(critere, valeur)));
        return resultats;
    }

    public List<Morceau> trier(String critere) {
        return switch (critere.toLowerCase()) {
            case "titre" -> morceaux.stream().sorted((a, b) -> a.getTitre().compareTo(b.getTitre())).collect(Collectors.toList());
            case "ecoutes" -> morceaux.stream().sorted((a, b) -> b.getNbEcoutes() - a.getNbEcoutes()).collect(Collectors.toList());
            default -> morceaux;
        };
    }

    public List<Morceau> getMorceaux() { return morceaux; }
    public List<Album> getAlbums() { return albums; }
    public List<Artiste> getArtistes() { return artistes; }
    public List<Groupe> getGroupes() { return groupes; }
}
