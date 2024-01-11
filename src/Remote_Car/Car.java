package Remote_Car;

public class Car {
    private int slote;
    private double carP;
    private final double wollt = 1.5;
    Battary[] battaries;

    private double s = 0;
    private double s0 = 0;

    public Car(int slote, double carP) {
        this.slote = slote;
        this.carP = carP;
        this.battaries = new Battary[slote];
    }

    public boolean add(Battary battary) {
        if (slote > 0) {
            s += battary.getmAh();
            s0 += battary.getmAh();
            battaries[slote - 1] = battary;
            slote--;
            return true;
        }
        return false;
    }

    public boolean run(int minut) {
        if (s - (carP * minut) >= 0) {
            s -= carP * minut;
            return true;
        }
        return false;
    }

    public void ShowInfio() {
        System.out.printf("batareka quvvati %.1f", (s*100)/s0);
        System.out.println("%");
        System.out.println("slotlar sonii "+ battaries.length);
    }


}
