package Lesson19.Hamburger.ingredients;

public enum Salads {
    Tomato(2_000),Cheese(2_000),Cabbage(2_000),Cucumber(2_000),Onion(2_000),Chili(2_000),Chips(5_000);

    private int sum;
    Salads (int sum) {
        this.sum = sum;
    }

    public int getSum() {
        return this.sum;
    }

}
