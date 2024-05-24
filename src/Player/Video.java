package Player;

import java.util.Random;

public class Video extends Elementomultimediale implements Luminosità {
    private int luminosità;
    private int volume;
    private int durata;


    //costruttore
    public Video(String titolo) {
        super(titolo);
        Random rndm = new Random();
        this.luminosità = rndm.nextInt(1, 100);
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

    public int getLuminosità() {
        return luminosità;
    }

    public void setLuminosità(int luminosità) {
        this.luminosità = luminosità;
    }
}
