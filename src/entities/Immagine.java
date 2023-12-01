package entities;

public class Immagine extends ElementoMultimediale{

    public Immagine(String titolo) {
        super(titolo);
    }

    @Override
    public void play() {
        System.out.println("Immagine: " + getTitolo());
    }
}
