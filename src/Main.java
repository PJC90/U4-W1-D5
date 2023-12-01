import entities.ElementoMultimediale;
import entities.Immagine;
import entities.RegistrazioneAudio;
import entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Immagine img = new Immagine("Parigi", 5);
//        Video vd = new Video("TimeLaps", 2,1, 1);
//        RegistrazioneAudio audio = new RegistrazioneAudio("Discorso", 2,5);
//
//        img.show();
//        img.diminuisciLuminosita();
//        img.show();
//        vd.play();
//        vd.aumentaLuminosita();
//        vd.play();
//        audio.play();
//        audio.abbassaVolume();
//        audio.play();
        Scanner sc = new Scanner(System.in);
        ElementoMultimediale[] input = new ElementoMultimediale[5];
        for(int i=0; i<5; i++ ){
            System.out.println("Digita 1 per Registrazione Audio, 2 per Video, 3 per Immagine");
            int scelta = Integer.parseInt(sc.nextLine());
            if(scelta == 1){
                System.out.println("Inserisci Titolo:");
                String titolo = sc.nextLine();
                System.out.println("Inserisci Durata:");
                int durata = Integer.parseInt(sc.nextLine());
                System.out.println("Inserisci Volume:");
                int volume = Integer.parseInt(sc.nextLine());
                input[i] = new RegistrazioneAudio(titolo,durata,volume);
            } else if (scelta == 2) {
                System.out.println("Inserisci Titolo:");
                String titolo = sc.nextLine();
                System.out.println("Inserisci Durata:");
                int durata = Integer.parseInt(sc.nextLine());
                System.out.println("Inserisci Volume:");
                int volume = Integer.parseInt(sc.nextLine());
                System.out.println("Inserisci Luminosità");
                int luminosita = Integer.parseInt(sc.nextLine());
                input[i] = new Video(titolo,durata,volume,luminosita);
            } else if(scelta ==3){
                System.out.println("Inserisci Titolo:");
                String titolo = sc.nextLine();
                System.out.println("Inserisci Luminosità:");
                int luminosita = Integer.parseInt(sc.nextLine());
                input[i] = new Immagine(titolo, luminosita);
            } else{
                System.out.println("scelta non valida");
                i--;
            }
        }
        int  esec;
        do{
            System.out.println("quale oggetto eseguire da 1 a 5? 0 per terminare");
            esec = Integer.parseInt(sc.nextLine());
            if(esec >= 1 && esec <= 5){
                if(input[esec -1] instanceof Immagine){
                    ((Immagine)input[esec -1]).show();
                } else{
                    input[esec -1].play();
                }
            } else if (esec != 0) {
                System.out.println("scelta non valida");
            }
        } while (esec != 0);
        System.out.println("Fine!");

    }
}