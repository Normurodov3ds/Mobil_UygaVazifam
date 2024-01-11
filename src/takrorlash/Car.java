package takrorlash;

public class Car {
    int a;
    private Car(int a) {
     this.a = a;
    }
   public static Car get(int a){
        return new Car(a);
   }
}
