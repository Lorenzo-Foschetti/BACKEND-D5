package Player;

import java.util.Random;

public class Immagine extends Elementomultimediale implements Show, Luminosità {
    private int luminosità;

    //costruttore
    public Immagine(String titolo) {
        super(titolo);
        Random rndm = new Random();
        this.luminosità = rndm.nextInt(1, 100);
    }


    //override del metodo dell'interfaccia show
    @Override
    public void show() {
        for (int i = 0; i < this.luminosità; i++) {
            System.out.println("*");
        }
    }

    //ovveride del metodo dell'interfaccia Volume
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
