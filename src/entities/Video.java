package entities;

public class Video extends ElementoMultimediale{

    public Video(String titolo, int durata) {
        super(titolo, durata);
    }

    @Override
    public void play() {
        System.out.println("Video: " +getTitolo() + " Durata: " + getDurata());
    }
}
