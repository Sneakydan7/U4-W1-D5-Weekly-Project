package it.epicode.be.WeeklyProject.Children;

import it.epicode.be.WeeklyProject.AbstractsAndInterfaces.MultimediaPlayable;

public class Audio extends MultimediaPlayable {


    public Audio(String titolo, int volume, int durata) {
        super(titolo, volume, durata);

    }

    @Override
    public void play() {
        System.out.println("---------------------");
        for (int i = 0; i < getDurata(); i++) {
            System.out.printf(getTitolo());
            for (int j = 0; j < getVolume(); j++) {
                System.out.print("!");
            }
            if (i == getDurata() - 1) {
                break;
            } else {
                System.out.println();
            }
        }

        System.out.println(" ");
        System.out.println("---------------------");
    }

    @Override
    public String toString() {
        return "titolo=" +
                getTitolo() +
                ", volume=" + getVolume() +
                ", durata=" + getDurata() +
                '}';
    }


}
