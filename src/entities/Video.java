package entities;

public class Video extends ElementoMultimediale {
    private int volume;
    private int durata;
    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo);

        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;

    }

    public void aumentaVolume() {
        volume++;
    }

    public void diminuisciVolume() {
        if (volume > 0) volume--;
    }


    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + "!".repeat(volume) + "*".repeat(luminosita));
        }
    }


    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        if (luminosita > 0) luminosita--;
    }

    @Override
    public void avviaAzione() {
        play();

    }
}
