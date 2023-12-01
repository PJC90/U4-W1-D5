import entities.Immagine;
import entities.RegistrazioneAudio;
import entities.Video;

public class Main {
    public static void main(String[] args) {
        Immagine img = new Immagine("Parigi");
        Video vd = new Video("TimeLaps", 2589,1);
        RegistrazioneAudio audio = new RegistrazioneAudio("Discorso", 425,5);

        img.play();
        vd.play();
        vd.alzaVolume();
        vd.play();
        audio.play();
        audio.abbassaVolume();
        audio.play();

    }
}