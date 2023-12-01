package entities;

import interfaces.Player;

public abstract class ElementoMultimediale implements Player {
    private String titolo;
    private int durata;

    public String getTitolo() {
        return titolo;
    }

    public int getDurata() {
        return durata;
    }

    public abstract void play();
}
