package Lesson16.Anonymus;

public class Anonymus {
    private Anonymus(){

    }
    public  static  Anonymus getInstance(){
        return new Anonymus();
    }
    public Anonymus show(){
        return this;
    }
}
