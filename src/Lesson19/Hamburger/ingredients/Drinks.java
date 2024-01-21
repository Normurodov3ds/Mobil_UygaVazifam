package Lesson19.Hamburger.ingredients;

public enum Drinks {

    Tarxun(6_000),Pepse(10_000),Fanta(7_000),Sarbast(16_000),Pulsar(17_000),Vino(22_000);

    private int sum;
    Drinks(int sum) {
        this.sum = sum;
    }

    public int getSum(){
        return this.sum;
    }
}
