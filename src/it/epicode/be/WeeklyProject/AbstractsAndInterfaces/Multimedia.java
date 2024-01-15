package it.epicode.be.WeeklyProject.AbstractsAndInterfaces;

public abstract class Multimedia {

    private String titolo;

    public Multimedia(String titolo) {
        this.titolo = titolo;
    }


    //GETTERS


    public String getTitolo() {
        return titolo;
    }


    //SETTERS

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    @Override
    public String toString() {
        return "Multimedia{" +
                "titolo='" + titolo + '\'' +
                '}';
    }
}
