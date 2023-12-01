package entities;

public class RegistrazioneAudio extends ElementoMultimedialeVolume{

    public RegistrazioneAudio(String titolo,int durata, int volume) {
        super(titolo, durata, volume);

    }

    @Override
    public void play() {
        for (int q = 0; q < durata; q++) {
            System.out.println("Riproduzione:" + getTitolo() + " (Durata: " + getDurata() + ")");
            System.out.println("Volume:");
            for (int j = 0; j < volume; j++) {
                for (int i = 0; i < volume; i++) {
                    System.out.print("!");
                }
                System.out.println();
            }
        }
    }
}
