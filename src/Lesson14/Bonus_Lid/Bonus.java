package Lesson14.Bonus_Lid;

public class Bonus {
    private int count;

    public Bonus(int count) {
        this.count = count;
    }

    Lid[] lids = new Lid[]{};

    public boolean check(Lid lid) { // abaz   1b1z  12126  12126
        if (count<=0){
            System.out.println("yutuqlar tugadi.!");
            return false;
        }
        for (int i = 0; i < lids.length; i++) {
            if (lids[i].getCode().equals(lid.getCode())) {
                return false;
            }
        }
        String s = lid.getCode();
        String s0 = "";
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            if (i < 4) {
                s0 += replase(s.charAt(i));
            } else {
                s1 += replase(s.charAt(i));
            }
        }
        Lid[] lids1 = new Lid[lids.length + 1];
        for (int i = 0; i < lids.length; i++) {
            lids1[i] = lids[i];
        }
        lids1[lids.length] = lid;
        lids = lids1;
        if (s0.equals(s1)) {
            count--;
            return true;
        }
        return false;
    }

    private static char replase(char a) {
        if (a >= 48 && a <= 57) {
            return a;
        } else if (a <= 'z' && a >= 'a') {
            return (char) ((a - 96) + 48);
        } else {
            return (char) (a - 4);
        }
    }


}
