package Lesson15.Hayvonlar;

public enum Animals {

    MOL{
        @Override
        public void vois() {
            System.out.println("mo' - o'");
        }
    },KUCHUK{
        @Override
        public void vois() {
            System.out.println("vov-vov");
        }
    },QOY{
        @Override
        public void vois() {
            System.out.println("ba-aa");
        }
    },ECHKI{
        @Override
        public void vois() {
            System.out.println("ma-aa");
        }
    },XUROZ{
        @Override
        public void vois() {
            System.out.println("qo'qira qo'q");
        }
    };
    public  void vois(){
        System.out.println("vois");
    }
}

