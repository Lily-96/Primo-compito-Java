package entities;

import interfaces.Luminosita;
import interfaces.Riproducibile;

public abstract class ElementoMultimediale implements Riproducibile, Luminosita {
    protected String titolo;

    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }


    @Override
    public void show() {

    }

    @Override
    public String toString() {
        return "ElementoMultimediale{" +
                "titolo='" + titolo + '\'' +
                '}';
    }

    @Override
    public void play() {

    }

    public abstract void avviaAzzione();
}
