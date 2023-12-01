package entities;

public class RegistrazioneAudio extends ElementoMultimediale{
    private int volume;
    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo, durata);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public  void abbassaVolume(){
        if(volume > 0){
            volume --;
        }else {
            System.out.println("Il volume è già impostato a zero!");
        }
    }
    public  void alzaVolume(){
            volume ++;
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
