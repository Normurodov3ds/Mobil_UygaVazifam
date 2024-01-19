package Lesson19.Hamburger.ingredients;

public enum Meat {
    Beef(15_000),Mutton(12_000),HorseMeat(18_000);

    private  int sum;
    Meat(int sum) {
        this.sum = sum;
    }
    public int getSum(){
        return this.sum;
    }
}
