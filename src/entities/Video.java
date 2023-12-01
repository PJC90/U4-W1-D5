package entities;

public class Video extends ElementoMultimedialeVolume{
    public int luminosita;
    public Video(String titolo,int durata, int volume, int luminosita) {
        super(titolo, durata, volume);
        this.luminosita = luminosita;
    }
    public void aumentaLuminosita(){
        luminosita++;
    }
    public void diminuisciLuminosita(){
        if(luminosita > 0) {
            luminosita--;
        }else{
            System.out.println("la luminosità è già impostata a 0");
        }
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
            for (int a = 0; a < luminosita; a++) {
                for (int b = 0; b < luminosita; b++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
