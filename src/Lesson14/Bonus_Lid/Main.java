package Lesson14.Bonus_Lid;

public class Main {
    public static void main(String[] args) {
        Bonus bonus = new Bonus(4);
        Lid lid = new Lid("abaa2324");
        System.out.println(bonus.check(lid));
        System.out.println(bonus.check(new Lid("aaab11a2")));
        System.out.println(bonus.check(new Lid("abaa2324")));
        System.out.println(bonus.check(new Lid("a21b1ba2")));
    }
}
