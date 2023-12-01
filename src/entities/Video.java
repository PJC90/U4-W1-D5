package entities;

public class Video extends ElementoMultimedialeVolume{

    public Video(String titolo,int durata, int volume) {
        super(titolo, durata, volume);
    }
    @Override
    public void play() {
        System.out.println("Riproduzione:" + getTitolo() + " (Durata: " + getDurata() + " secondi)");
        System.out.println("Volume:");
        for (int j = 0; j < volume; j++) {
            for (int i = 0; i < volume; i++) {
                System.out.print("!");
            }
            System.out.println();
        }
    }

}
