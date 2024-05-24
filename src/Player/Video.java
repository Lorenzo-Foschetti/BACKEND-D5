package Player;

import java.util.Random;

public class Video extends Elementomultimediale implements Luminosità, Volume {
    private int luminosità;
    private int volume;
    private int durata;


    //costruttore
    public Video(String titolo) {
        super(titolo);
        Random rndm = new Random();
        this.luminosità = rndm.nextInt(1, 100);
        Random rndm2 = new Random();
        this.volume = rndm.nextInt(1, 100);
    }


    //override dei metodi dell'interfaccia Luminosità
    @Override
    public void aumentaLuminosità() {
        if (this.luminosità == 100) {
            System.out.println("Non puoi alzare ulteriormente la luminosità");
        } else this.setLuminosità(++luminosità);
    }

    @Override
    public void diminuisciLuminosità() {
        if (this.luminosità > 0) {
            setLuminosità(--luminosità);
        } else {
            System.out.println("Non puoi abbassare ulteriormente la luminosità");
        }
    }

    //getter e setter della luminosità
    public int getLuminosità() {
        return luminosità;
    }

    public void setLuminosità(int luminosità) {
        this.luminosità = luminosità;
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
