package Lesson15.Fasillar;

public enum Fasil {
    BAHOR {
        @Override
        public void oy(int a) {
            super.oy(3);
        }
    }, YOZ {
        @Override
        public void oy(int a) {
            super.oy(6);
        }
    }, KUZ {
        @Override
        public void oy(int a) {
            super.oy(9);
        }
    }, QISH {
        @Override
        public void oy(int a) {
            super.oy(12);
        }
    };

    public void oy(int a) {
        int m = a+3;
        for (int i = a; i < m; i++) { // 3 martta ishlaydi
            if (i == 13) {
                i = 1;
                m = 3;
            }
            switch (i) {
                case 1:
                    System.out.println("Yanvar");
                    break;
                case 2:
                    System.out.println("Fevral");
                    break;

                case 3:
                    System.out.println("Mart");

                    break;
                case 4:
                    System.out.println("Aprel");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("Iyun");
                    break;
                case 7:
                    System.out.println("Iyul");
                    break;
                case 8:
                    System.out.println("Avgust");
                    break;
                case 9:
                    System.out.println("Sentabr");
                    break;
                case 10:
                    System.out.println("Oktabr");
                    break;
                case 11:
                    System.out.println("Noyabr");
                    break;
                case 12:
                    System.out.println("Dekabr");
                    break;
            }
        }
    }
}
