package bilet5;

public class MaKeIceCream {
    private int milk;
   private int sugar;

    public MaKeIceCream(int milk, int sugar) {
        this.milk = milk;
        this.sugar = sugar;
    }

    void addMilk(int a){
        milk+=a;

    }
    void addSugar(int a){
        sugar+=a;

    }
    int maxIceCreamCount(int a,int b){
        int min;
        // 800g  30g
        // 700 mln 50 ml

        if(milk/a<sugar/b){
           min=milk/a;
           milk=milk-a;
        }
        else {
            min=sugar/b;
            sugar-=b;
        }
        return min;
    }
    void showInfo(){
        System.out.println(sugar +" sugar qoldi");
        System.out.println(milk +" milk qoldi");

    }



}
