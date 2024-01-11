package bilet13;

public abstract class Shape {
    int a;
    int b;
    int c;
    int r;

    public Shape(int a,int b,int c){
       this.a=a;
        this.b=b;
       this.c=c;
    }
   abstract public int getPerimetr();
    public int getSquare(){
        int p=(a+b+c)/2;
        int s= (int) Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }
    public int getSideCount(){
        return 3;
    }
}


