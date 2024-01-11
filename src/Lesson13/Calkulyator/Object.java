package Lesson13.Calkulyator;

public class Object extends Action {
    private String s;
    private String a;
    private String b;
    private char x;
    String[] history = new String[100];
    private int index = 0;

    public void set(String s) {
        this.s = s + " = ";
        byte index = indexff(s);
        if (index != 0) {
            this.a = s.substring(0, index);
            this.b = s.substring(index + 1);
            this.x = s.charAt(index);
            action(this.x);
        } else if (s.equalsIgnoreCase("history")) {
            setHistory();
        }else{
            System.out.println(s);
            System.out.println("error.!");
        }
    }

    public Object() {

    }

    private byte indexff(String s) {
        for (byte i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '+' -> {
                    return i;
                }
                case '-' -> {
                    return i;
                }
                case '/' -> {
                    return i;
                }
                case '*' -> {
                    return i;
                }
            }
        }
        return (byte) 0;
    }


    @Override
    public double add(String a, String b) {
        return Double.parseDouble(a) + Double.parseDouble(b);
    }

    @Override
    public double degre(String a, String b) {
        return Double.parseDouble(a) - Double.parseDouble(b);
    }

    @Override
    public double multip(String a, String b) {
        return Double.parseDouble(a) * Double.parseDouble(b);
    }

    @Override
    public double division(String a, String b) {
        return Double.parseDouble(a) / Double.parseDouble(b);
    }

    private void action(char x) {
        switch (x) {
            case '+': {
                history[index++] = new String(this.s + Double.toString(add(this.a, this.b)));
                System.out.print(history[index - 1]);
            }
            break;
            case '-': {
                history[index++] = new String(this.s + Double.toString(degre(this.a, this.b)));
                System.out.print(history[index - 1]);
            }
            break;
            case '*': {
                history[index++] = new String(this.s + Double.toString(multip(this.a, this.b)));
                System.out.print(history[index - 1]);
            }
            break;
            case '/': {
                history[index++] = new String(this.s + Double.toString(division(this.a, this.b)));
                System.out.print(history[index - 1]);
            }
            break;
        }
    }


    private void setHistory() {
        for (int i = 0; i < index; i++) {
            System.out.println("==============");
            System.out.println((i + 1) + " - amal.!");
            System.out.println(history[i]);
        }
        System.out.println("==============");
    }


}
