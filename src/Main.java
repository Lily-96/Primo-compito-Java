import entities.Video;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Titolo: ");
        String titolo = scanner.nextLine();
        System.out.println("Durata: ");
        int durata = scanner.nextInt();
        System.out.println("Volume: ");
        int volume = scanner.nextInt();
        System.out.println("Luminosità: : ");
        int luminosita = scanner.nextInt();

        Video videoProva = new Video(titolo, durata, volume, luminosita);
        videoProva.avviaAzione();


    }
}