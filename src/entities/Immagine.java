package entities;

public class Immagine extends ElementoMultimediale{
    public int luminosita;
    public Immagine(String titolo, int luminosita) {
        super(titolo);
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


    public void show() {
        System.out.println("Riproduzione:" + getTitolo() );
        System.out.println("Luminosità"+ getTitolo());
        for (int a = 0; a < luminosita; a++) {
            for (int b = 0; b < luminosita; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
