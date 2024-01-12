import it.epicode.be.WeeklyProject.AbstractsAndInterfaces.Multimedia;
import it.epicode.be.WeeklyProject.Children.Audio;
import it.epicode.be.WeeklyProject.Children.Immagine;
import it.epicode.be.WeeklyProject.Children.Video;

import java.util.Scanner;

public class MainPlayer {
    public static void main(String[] args) {
        Audio audio1 = new Audio("paperino", 4, 3);
        System.out.println(audio1);
        Video video1 = new Video("paperino e io", 5, 4, 5);
        System.out.println(video1);

        Immagine immagine1 = new Immagine("paperino e pippo", 5);
        video1.play();
        audio1.play();
        immagine1.show();


        Multimedia[] multimedia;

        Scanner scan = new Scanner(System.in);
        try
    }


    static private void creazione(int num, Multimedia[] multimedia) {
        Multimedia selezione = multimedia[num];
        System.out.printf("%s selezionato", selezione);
        Scanner scan = new Scanner(System.in);

        switch ()

    }


    static private void selezione(int num,)
}