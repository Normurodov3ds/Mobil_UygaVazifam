package Lesson18.Atm;

import java.util.Objects;
import java.util.Scanner;

public class Money implements Comparable<Money>{
    private int name;
    private int amount;

    public Money(int name) {
        this.name = name;
    }

    public Money(int name, int amount) {
        this.name = name;
        this.amount = amount;
        while (this.amount%((this.name)*1000)!=0){
            Scanner in = new Scanner(System.in);
            System.out.println("xato miqdor kritildi.!");
            System.out.println("=============");
            System.out.println("boshqatdan kiriting.!");
            System.out.println("Money name (M-n:"+50+"): ");
            this.name = in.nextInt();
            System.out.println("miqdori :(M-n:100_000): ");
            this.amount = in.nextInt();
        }
    }

    public int getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount += amount;
    }

    @Override
    public String toString() {
        return "Mony{" +
                "name = " + name + " ming so'mlik " + ", count = " + amount/((name)*1000)+" ta,"+ " amount = "+amount/1000+"_000 so'm"+'}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return Objects.equals(name, money.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amount);
    }

    @Override
    public int compareTo(Money o) {

        return Integer.valueOf(o.name).compareTo(Integer.valueOf(this.name));
    }
}
