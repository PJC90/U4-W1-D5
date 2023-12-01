import entities.Immagine;
import entities.RegistrazioneAudio;
import entities.Video;

public class Main {
    public static void main(String[] args) {
        Immagine img = new Immagine("Parigi");
        Video vd = new Video("TimeLaps", 500);
        RegistrazioneAudio audio = new RegistrazioneAudio("Discorso", 800);

        img.play();
        vd.play();
        audio.play();
    }
}