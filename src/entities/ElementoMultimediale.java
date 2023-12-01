package entities;

import interfaces.Player;

public abstract class ElementoMultimediale implements Player {
    private String titolo;

    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }



    @Override
    public void play() {

            System.out.println("Riproduzione:" + getTitolo());

    }
//    public abstract void play();
}
