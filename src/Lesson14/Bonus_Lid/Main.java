package Lesson14.Bonus_Lid;

public class Main {
    public static void main(String[] args) {


        Bonus bonus = new Bonus(15);
        Lid lid = new Lid("abaa2324");
        System.out.println(bonus.check(lid));
        System.out.println(bonus.check(new Lid("aaab11a2")));
        System.out.println(bonus.check(new Lid("a21b1ba2")));
        System.out.println(bonus.check(new Lid("A2121212")));
        System.out.println(bonus.check(new Lid("a21b1ba2")));
        System.out.println(bonus.check(new Lid("a21b1ba2")));
        //a21b1ba2
        //1212 1212
    }
}
