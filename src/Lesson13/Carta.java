package Lesson13;

public enum Carta {

    UZKARD(){
        int a;
        String name;
        @Override
        public void setA(int b) {
            a = b;
        }

        @Override
        void setname(String name1) {
            name = name1;
        }
    }, VIZA{
        int a;
        String name;
        @Override
        public void setA(int b) {
            a = b;
        }

        @Override
        void setname(String name1) {
            name = name1;
        }

    },HUMO{
        int a;
        String name;
        @Override
        public void setA(int b) {
            a = b;
        }

        @Override
        void setname(String name1) {
            name = name1;
        }
    }
    ,MASTER{
        int a;
        String name;
        @Override
        public void setA(int b) {
            a = b;
        }

        @Override
        void setname(String name1) {
            name = name1;
        }
    };
    Carta() {

    }

    abstract void setA(int a);
    abstract void setname(String name);
}
