package Lesson14.Bonus_Lid;

public class Bonus {
    private final int counts;
    private int count;

    public Bonus(int counts) {
        this.counts = counts;
    }

    Lid[] lids = new Lid[]{}; //

    public boolean check(Lid lid) { // abaz   1b1z  12126  12126
        if (counts == count || lid.getCode().length() != 8) {
            return false;
        }
        String s = lid.getCode();
        String s0 = lid.getCode().substring(0, 4);
        String s1 = lid.getCode().substring(4);
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) >= 48 && s.charAt(i) <= 57)) {
                str += s.charAt(i);
            }
        }

        String s12 = str.replaceAll("\\s[auieo]\\s", "");

        String s13 = str.replaceAll("\\s[b-dg-hf-np-tv-zB-DG-HF-NP-TV-Z]\\s", "");

        System.out.println(s12.length());
        System.out.println(s13.length());

        return true;
    }

    private static char replase(char a) {
        return ' ';
    }


}
