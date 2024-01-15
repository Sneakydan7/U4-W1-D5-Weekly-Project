import it.epicode.be.WeeklyProject.AbstractsAndInterfaces.Multimedia;
import it.epicode.be.WeeklyProject.Children.Audio;
import it.epicode.be.WeeklyProject.Children.Immagine;
import it.epicode.be.WeeklyProject.Children.Video;

import java.util.Scanner;

public class MainPlayer {
    public static void main(String[] args) {


        Multimedia[] multimedia = new Multimedia[5];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < multimedia.length; i++) {
            System.out.printf("Crea un nuovo file multimediale! Inserisci un numero per: %n" +
                    "1-Immagine %n" +
                    "2-Audio %n" +
                    "3-Video %n");
            int tipo = scan.nextInt();
            if (tipo == 1) {
                scan.nextLine();
                System.out.println("Inserisci un titolo per la tua immagine");
                String titolo = scan.nextLine();
                System.out.println("Inserisci la luminosità dell'immagine");
                int lum = scan.nextInt();
                Immagine img = new Immagine(titolo, lum);
                multimedia[i] = img;
            } else if (tipo == 2) {
                scan.nextLine();
                System.out.println("Inserisci un titolo per il tuo audio");
                String titolo = scan.nextLine();
                System.out.println("A che volume vuoi ascoltarlo? Inserisci un numero da 1 a 10");
                int aud = scan.nextInt();
                System.out.println("Quanto dura l'audio? Inserisci un numero di secondi");
                int dur = scan.nextInt();
                Audio audio = new Audio(titolo, aud, dur);
                multimedia[i] = audio;
            } else if (tipo == 3) {
                scan.nextLine();
                System.out.println("Inserisci un titolo per il tuo video");
                String titolo = scan.nextLine();
                System.out.println("A che volume vuoi ascoltarlo? Inserisci un numero da 1 a 10");
                int aud = scan.nextInt();
                System.out.println("Quanto dura il video? Inserisci un numero di secondi");
                int dur = scan.nextInt();
                System.out.println("Inserisci la luminosità del video");
                int lum = scan.nextInt();
                Video video = new Video(titolo, aud, dur, lum);
                multimedia[i] = video;

            }
        }


        while (true) {
            System.out.println("Ora seleziona un multimedia:");
            printMultimediaList(multimedia);
            int num = scan.nextInt();
            playMultimedia(multimedia[num]);
            scan.nextLine();
            System.out.println("Vuoi continuare? (Y/N)");
            String continuare = scan.nextLine();
            if (continuare.equalsIgnoreCase("N")) {
                break;
            }
        }
    }


    public static void printMultimediaList(Multimedia[] multimedia) {
        for (int i = 0; i < multimedia.length; i++) {
            System.out.println(i + ":" + multimedia[i].toString());
        }

    }


    public static void playMultimedia(Multimedia multimedia) {
        switch (multimedia) {
            case Audio audio -> audio.play();
            case Video video -> video.play();
            case Immagine img -> img.show();
            default -> System.out.println("Multimedia non trovato!");
        }
    }

}