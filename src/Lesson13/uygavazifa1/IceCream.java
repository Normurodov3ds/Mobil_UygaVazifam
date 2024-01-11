package Lesson13.uygavazifa1;

public class IceCream {
    private Milk milk = new Milk();
    private Sugar sugar = new Sugar();
    private Retsept retsept;
    private Prise prise;
    private double ballanse;
    String[] str = new String[]{};

    public IceCream(Retsept retsept, Prise prise) {
        this.retsept = retsept;
        this.prise = prise;
    }

    public void addMilk(Milk milk) {
        this.milk.setMilk(this.milk.getMilk()+milk.getMilk());
        this.milk.setSum(milk.getSum());
    }
    public void addSugar(Sugar sugar) {
       this.sugar.setSugar(this.sugar.getSugar()+sugar.getSugar());
       this.sugar.setSum(sugar.getSum());
    }

    public int count() {
        double milk = this.milk.getMilk();
        double sugar = this.sugar.getSugar();
        double[] how = howMach(this.retsept, this.prise);
        int count = 0;
        while (milk > how[0] && sugar > how[1]) {
            milk -= how[0];
            sugar -= how[1];
            count++;
        }
        return count;
    }


    private static double[] howMach(Retsept retsept, Prise prise) {
        double a = retsept.getA();// sut
        double b = retsept.getB();// shakar
        double p = prise.getMassa();
        p = p / (a + b);
        return new double[]{a * p, p * b};
    }

    public boolean buy(int count) {
        if (count <= count()) {
            String[] str1 = new String[str.length + 1];
            System.arraycopy(str, 0, str1, 0, str.length);
            str1[str.length] = prise.getSum() + " * " + count + " = " + this.prise.getSum() * count;
            str = str1;
            this.ballanse += this.prise.getSum() * count;
            double[] how = howMach(retsept, prise);
            this.milk.setMilk(this.milk.getMilk() - (count * how[0]));
            this.sugar.setSugar(this.sugar.getSugar() - count * how[1]);
            return true;
        }
        return false;
    }

    public boolean hasIcream() {
        return count() > 0;
    }

    public void getInfo() {
        double sum = 0;
        double count = 0;
        for (int i = 0; i < this.str.length; i++) {
            System.out.println("----------------");
            System.out.println((1 + i) + " - kun ");
            System.out.println(str[i]);

            count+= Double.parseDouble(str[i].substring(str[i].indexOf("*")+2,str[i].indexOf("=")-1));
           sum += Double.parseDouble(str[i].substring(str[i].indexOf("=")+1));
        }
        System.out.println();
        System.out.printf("sizda %.2f" , this.milk.getMilk());
        System.out.println(" L sut bor!");
        System.out.printf("sizda %.2f",this.sugar.getSugar());
        System.out.println(" kg shakar bor!");
        System.out.println("sizning daromadingiz : "+sum);
        double []how = howMach(retsept,prise);
        System.out.printf("sizning sof foidangiz : %.3f", (sum-(count*((this.sugar.getSum()*how[0])+(this.milk.getSum()*how[1])))));
        System.out.println("sutni narxi : "+this.milk.getSum()+" so'm");
        System.out.println("shakar narxi : "+this.sugar.getSum()+" so'm");
    }
    public double getBallanse() {
        return ballanse;
    }
}
