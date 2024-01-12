package it.epicode.be.WeeklyProject.Children;

import it.epicode.be.WeeklyProject.AbstractsAndInterfaces.Luminosita;
import it.epicode.be.WeeklyProject.AbstractsAndInterfaces.Multimedia;

public class Immagine extends Multimedia implements Luminosita {

    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }


    public void show() {
        System.out.println("---------------------");

        System.out.printf(getTitolo());
        for (int i = 0; i < getLuminosita(); i++) {
            System.out.print("*");
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
