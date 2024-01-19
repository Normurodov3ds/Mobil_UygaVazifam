package Lesson18.Collecton;

import java.util.Objects;

public class Tenes {
private SportMan sportMan;

    public Tenes(SportMan sportMan) {
        this.sportMan = sportMan;
    }

    public SportMan getSportMan() {
        return sportMan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tenes tenes = (Tenes) o;
        return Objects.equals(sportMan, tenes.sportMan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sportMan);
    }
}
