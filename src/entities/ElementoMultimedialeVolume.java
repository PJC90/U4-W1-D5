package entities;

public abstract class ElementoMultimedialeVolume extends ElementoMultimediale{
    protected int volume;
    protected int durata;
    public ElementoMultimedialeVolume(String titolo, int durata, int volume) {
        super(titolo);
        this.durata= durata;
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public int getDurata() {
        return durata;
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
}
