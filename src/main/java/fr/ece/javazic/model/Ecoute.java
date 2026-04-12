package fr.ece.javazic.model;

import java.time.LocalDateTime;

public class Ecoute {

    private LocalDateTime date;
    private Morceau morceau;

    public Ecoute(Morceau morceau) {
        this.date = LocalDateTime.now();
        this.morceau = morceau;
    }

    public LocalDateTime getDate() { return date; }
    public Morceau getMorceau() { return morceau; }
}
