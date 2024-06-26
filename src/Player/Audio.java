package Player;

import java.util.Random;

public class Audio extends Elementomultimediale implements Volume, Play {
    private int volume;
    private int durata;


    //costruttore
    public Audio(String titolo) {

        super(titolo);
        Random rndm = new Random();
        this.volume = rndm.nextInt(1, 100);

    }

    //override dell'interfaccia Volume
    @Override
    public void aumentaVolume() {
        if (this.volume == 100) {
            System.out.println("Non puoi alzare ulteriormente il volume");
        } else if (this.volume == 50) {
            System.out.println("Il tuo volume è ottimale!!");
        } else this.setVolume(++volume);

    }

    @Override
    public void diminuisciVolume() {
        if (this.volume == 0) {
            System.out.println("Non puoi abbassare ulteriormente il volume");
        } else if (this.volume == 50) {
            System.out.println("Il tuo volume è ottimale!!");
        } else this.setVolume(--volume);

    }

    //getter e setter del volume
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume impostato a: " + this.volume);
    }

    // override del metodo dell'interfaccia Play
    @Override
    public void play() {
        for (int i = 0; i < this.volume; i++) {
            System.out.println("!");
        }
        //for (int i = 0; i < this.getDurata(); i++) {
        // System.out.print(this.getTitolo());
        //}


    }

    //getter e setter di durata
    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
        // System.out.println("Il titolo è " + this.getTitolo());
    }
}
