package Player;

public abstract class Elementomultimediale {
    private String titolo;

    //costruttore
    public Elementomultimediale(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
}
