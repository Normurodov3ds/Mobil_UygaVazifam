package exprement;

public class B {
    public A a;
    public B(){
        int count = 12;
        a = new A();
        final int f = count;
        a.setAcrion(new Acrion() {
            @Override
            public void go() {
                System.out.println(f);
            }
        });
        a.getAction();
    }
}
