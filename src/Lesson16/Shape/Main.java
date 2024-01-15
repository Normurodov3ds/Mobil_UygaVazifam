package Lesson16.Shape;

public class Main {
    public static void main(String[] args) {

        // inner class lardan foydalanildi

        Shakillar.Rectengel rectengel = new Shakillar.Rectengel(4,5);
        System.out.println(rectengel.getPeremetr());
        System.out.println(rectengel.grtSqure());

        System.out.println();

        Shakillar shakillar = new Shakillar();
        Shakillar.Trangle trangle = shakillar.new Trangle(4,5,3);
        System.out.println(trangle.getPeremetr());
        System.out.println(trangle.grtSqure());

    }
}
