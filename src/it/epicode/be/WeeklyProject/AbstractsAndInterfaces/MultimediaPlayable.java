package it.epicode.be.WeeklyProject.AbstractsAndInterfaces;

public abstract class MultimediaPlayable extends Multimedia implements Riproducibile {

    private int volume;

    private int durata;

    public MultimediaPlayable(String titolo, int volume, int durata) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;

    }

    @Override
    public void alzaVolume() {
        setVolume(getVolume() + 1);
        System.out.println("Volume alzato");
    }

    @Override
    public void abbassaVolume() {
        setVolume(getVolume() - 1);
        System.out.println("Volume abbassato");
    }

    public abstract void play();


    //GETTERS


    public int getVolume() {
        return volume;
    }

    public int getDurata() {
        return durata;
    }

    //SETTERS

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    @Override
    public String toString() {
        return "MultimediaPlayable{" +
                "volume=" + volume +
                ", durata=" + durata +
                '}';
    }
}
