package Lesson20.massaliqlar;


public class Masaliqlar {
    private Masaliq masaliq;
    private int count;
    private int prise;

    public Masaliqlar(Masaliq masaliq, int count, int prise) {
        this.masaliq = masaliq;
        this.count = count;
        this.prise = prise;
    }

    public Masaliqlar(Masaliq masaliq, int count) {
        this.masaliq = masaliq;
        this.count = count;
    }

    public Masaliq getMasaliq() {
        return masaliq;
    }

    public int getCount() {
        return count;
    }

    public int getPrise() {
        return prise;
    }

    public void setMasaliq(Masaliq masaliq) {
        this.masaliq = masaliq;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }


}
