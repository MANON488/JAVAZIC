package fr.ece.javazic.model;

public abstract class Utilisateur {

    private int id;
    private String nom;
    private String email;
    private String motDePasse;

    public Utilisateur(int id, String nom, String email, String motDePasse) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.motDePasse = motDePasse;
    }

    public void quitter() {
        System.out.println("Au revoir " + nom + " !");
        System.exit(0);
    }

    public abstract void afficherMenu();

    public int getId() { return id; }
    public String getNom() { return nom; }
    public String getEmail() { return email; }
    public String getMotDePasse() { return motDePasse; }
}
