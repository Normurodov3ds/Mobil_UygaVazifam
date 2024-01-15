package Lesson16.Shape;

public class Shakillar {

    static class Rectengel implements Shape{
        private double a;
        private double b;

        public Rectengel(double a, double b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public double getPeremetr() {
            return 2*(a+b);
        }

        @Override
        public double grtSqure() {
            return a*b;
        }
    }

   public class Trangle implements Shape{
        private double a;
        private double b;
        private double c;

        public Trangle(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        @Override
        public double getPeremetr() {
            return a+b+c;
        }

        @Override
        public double grtSqure() {
            double p = (a+b+c)/2;
            return Math.sqrt(p*(p-a)*(p-b)*(p-c));
        }
    }


}
