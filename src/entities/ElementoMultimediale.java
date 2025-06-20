package entities;

import interfaces.Luminosita;
import interfaces.Riproducibile;

public abstract class ElementoMultimediale implements Riproducibile, Luminosita {
    private String titolo;

    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    @Override
    public void luminosita() {

    }


    @Override
    public void play() {

    }
}
