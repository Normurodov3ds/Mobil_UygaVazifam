package Lesson18.Atm_alg;

import Lesson18.Atm.Atm;
import Lesson18.Atm.Money;

import java.util.ArrayList;

public class MAIN {
    public static void main(String[] args) {
        ArrayList<Money> monies = new ArrayList<>();
        monies.add(new Money(200, 1_000_000));
        monies.add(new Money(100, 500_000));
        monies.add(new Money(50, 500_000));
        monies.add(new Money(20, 40_000));
        monies.add(new Money(10, 70_000));
        monies.add(new Money(5, 20_000));
        monies.add(new Money(2, 10_000));
        monies.add(new Money(1, 10_000));
        ArrayList<Money> arrayList = new ArrayList<>();

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(700);
        integers.add(60);
        integers.add(1);

        ArrayList<Money> moneyArrayList = new ArrayList<>();
        boolean b0 = true;
        for (Integer integer : integers) {
            boolean b = false;
            int integr1 = integer;
            for (Money money : monies) {
                if (integr1 >= money.getName() && money.getAmount() >= integr1) {
                    int moneys = money.getAmount();
                    while (integr1 >= money.getName() && moneys >= 0) {
                        integr1 -= money.getName();
                        moneys -= money.getName() * 1000;
                    }
                    moneyArrayList.add(new Money(money.getName(), moneys));
                }
                if (integr1 == 0) {
                    b = true;
                    break;
                }
            }
            b0 &= b;
        }
        if (b0) {
            moneyArrayList.forEach(moneyArrayList1 -> {
                if (monies.contains(moneyArrayList1)) {
                    monies.set(monies.indexOf(moneyArrayList1),moneyArrayList1);
                }
            });
            System.out.println("Succses");
        } else {
            System.out.println("pul ytarli emas");
        }


        for (Money money : monies) {
            System.out.println(money);
        }


    }
}
