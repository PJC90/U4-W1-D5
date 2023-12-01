import entities.Immagine;
import entities.RegistrazioneAudio;
import entities.Video;

public class Main {
    public static void main(String[] args) {
        Immagine img = new Immagine("Parigi", 5);
        Video vd = new Video("TimeLaps", 2,1, 1);
        RegistrazioneAudio audio = new RegistrazioneAudio("Discorso", 2,5);

        img.show();
        img.diminuisciLuminosita();
        img.show();
        vd.play();
        vd.aumentaLuminosita();
        vd.play();
        audio.play();
        audio.abbassaVolume();
        audio.play();

    }
}