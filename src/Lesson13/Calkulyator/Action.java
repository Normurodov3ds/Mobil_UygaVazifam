package Lesson13.Calkulyator;

public abstract class Action  {
    Action(){

    }

    protected abstract double add(String a,String b);      // qo'shish
    protected abstract double degre(String a,String b);    // ayirish
    protected abstract double multip(String a,String b);   // ko'paytirish
    protected abstract double division(String a,String b); // bo'lish
}
