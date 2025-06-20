package entities;

public class RegistrazioneAudio extends ElementoMultimediale {
    private int volume;
    private int durata;

    public RegistrazioneAudio(String titolo, int volume, int durata) {
        super(titolo);
        if (durata >= 0) {
            this.durata = durata;
            this.volume = volume;

        } else {
            System.out.println("La durata deve essere maggiore di 0 riprova!");
        }
    }

    public void aumentaVolume() {
        volume++;
    }

    public void diminuisciVolume() {
        if (volume > 0) volume--;
    }

    @Override
    public void avviaAzzione() {
        play();

    }
}
