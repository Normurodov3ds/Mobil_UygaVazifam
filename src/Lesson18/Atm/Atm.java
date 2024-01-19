package Lesson18.Atm;

import java.util.ArrayList;
import java.util.Collections;

public class Atm {

    ArrayList<Money> monies = new ArrayList<>();

    public Atm() {
    }

    public void addMony(ArrayList<Money> monies) {
        Collections.sort(monies);
        monies.forEach(money -> {
            if (!this.monies.contains(money)) {
                this.monies.add(money);
            } else {
                monies.get(monies.indexOf(money)).setAmount(money.getAmount());
            }
        });
    }


    public void isGetMony(int getSum) {
        Collections.sort(monies);
        int a = getSum / 1000;//400 80 1
        ArrayList<Integer> integers = new ArrayList<>();
        int i = 1;

        while (a != 0) {
            if (a%10!=0){
                integers.add(a % 10 * i);
            }
            a /= 10;
            i *= 10;
        }

        ArrayList<Money> moneyArrayList = new ArrayList<>();
        boolean b0 = true;
        for (Integer integer : integers) {
            boolean b = false;
            int integr1 = integer; //300
            for (Money money : monies) {//100
                if (integr1 >= money.getName() && money.getAmount() >= integr1) {
                    int moneys = money.getAmount();
                    while (integr1 >= money.getName() && moneys >= 0) {
                        integr1 -= money.getName();
                        moneys -= money.getName() * 1000;
                       // 500 0000 -= 100 000 = 400 000
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
            System.out.println("==============");
            System.out.println("pul yechildi!");
            System.out.println("yichilgan summa: "+ getSum/1000+"_000 so'm.! "+integers.reversed());
            System.out.println("==============");
        } else {
            System.out.println("Pul yetarli emas");
            System.out.println(getSum);
        }
    }


public void monyInfo() {
    for (Money money : monies) {
        System.out.println(money);
    }
}

public int getBalans() {
    int sum = 0;
    for (Money money : monies) {
        sum += money.getAmount();
    }
    return sum;
}



}
