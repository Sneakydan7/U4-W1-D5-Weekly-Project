package it.epicode.be.WeeklyProject.Children;

import it.epicode.be.WeeklyProject.AbstractsAndInterfaces.Luminosita;
import it.epicode.be.WeeklyProject.AbstractsAndInterfaces.MultimediaPlayable;

public class Video extends MultimediaPlayable implements Luminosita {


    private int luminosita;


    public Video(String titolo, int volume, int durata, int luminosita) {
        super(titolo, volume, durata);

        this.luminosita = luminosita;
    }


    @Override
    public void play() {
        System.out.println("---------------------");
        for (int i = 0; i < getDurata(); i++) {

            System.out.printf(getTitolo());
            for (int j = 0; j < getVolume(); j++) {
                System.out.print("!");
            }
            for (int j = 0; j < getLuminosita(); j++) {
                System.out.print("*");
            }
            if (i == getVolume() - 1) {
                break;
            } else {
                System.out.println();
            }

        }
        System.out.println(" ");
        System.out.println("---------------------");
    }

    @Override
    public void aumentaLuminosita() {
        if (!(getLuminosita() <= 10)) {
            setLuminosita(getLuminosita() + 1);
            System.out.println("Luminosità alzata");
        }
    }

    @Override
    public void diminuisciLuminosita() {
        if (!(getLuminosita() == 0)) {
            setLuminosita(getLuminosita() - 1);
            System.out.println("Luminosità diminuita");
        }
    }


    //GETTERS

    public int getLuminosita() {
        return luminosita;
    }

    //SETTERS

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }
}
