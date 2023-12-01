package entities;

public class RegistrazioneAudio extends ElementoMultimediale{

    public RegistrazioneAudio(String titolo, int durata) {
        super(titolo, durata);
    }

    @Override
    public void play() {
        System.out.println("Audio: " + getTitolo() + " Durata: " + getDurata());
    }
}
