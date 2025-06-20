package entities;

public class RegistrazioneAudio extends ElementoMultimediale {
    private int volume;
    private int durata;

    public RegistrazioneAudio(String titolo, int volume, int durata) {
        super(titolo);

        this.durata = durata;
        this.volume = volume;


    }


    public void aumentaVolume() {
        volume++;
    }

    public void diminuisciVolume() {
        if (volume > 0) volume--;
    }

    @Override
    public void avviaAzione() {
        play();

    }


    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + "!".repeat(volume));
        }
    }


}
