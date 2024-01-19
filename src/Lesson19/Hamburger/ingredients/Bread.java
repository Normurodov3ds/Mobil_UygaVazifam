package Lesson19.Hamburger.ingredients;

public enum Bread {
    SimpleBread(5_000), BigBread(8_000), AmericanBread(10_000);

    private int sum;

    Bread(int sum) {
        this.sum = sum;
    }

    public int getSum() {
        return this.sum;
    }
}
