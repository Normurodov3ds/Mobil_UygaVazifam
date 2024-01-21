package Lesson20.massaliqlar;

import java.util.Objects;

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

    public void setCount(int count) {
        this.count += count;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Masaliqlar that = (Masaliqlar) o;
        return masaliq == that.masaliq;
    }

    @Override
    public int hashCode() {
        return Objects.hash(masaliq);
    }

    @Override
    public String toString() {
        return "Masaliqlar{" +
                "masaliq=" + masaliq +
                ", count=" + count +
                ", prise=" + prise +
                '}';
    }
}
