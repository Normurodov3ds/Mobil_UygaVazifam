package Lesson16.Students.Location;

public class Location {
    private final String legion;
    private final String sity;
    private final String street;
    private final int homeNomber;

    public Location(String legion, String sity, String street, int homeNomber) {
        this.legion = legion;
        this.sity = sity;
        this.street = street;
        this.homeNomber = homeNomber;
    }

    public String getLegion() {
        return legion;
    }

    public String getSity() {
        return sity;
    }

    public String getStreet() {
        return street;
    }

    public int getHomeNomber() {
        return homeNomber;
    }

    @Override
    public String toString() {
        return "Location{" +
                "legion='" + legion + '\'' +
                ", sity='" + sity + '\'' +
                ", street='" + street + '\'' +
                ", homeNomber=" + homeNomber +
                '}';
    }
}
