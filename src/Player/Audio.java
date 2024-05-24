package Player;

import java.util.Random;

public class Audio extends Elementomultimediale implements Volume {
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
    }
}
