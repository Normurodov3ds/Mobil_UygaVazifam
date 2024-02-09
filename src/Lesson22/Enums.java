package Lesson22;

public enum Enums {
    DUSHANBA(5, "Komil"), SESHANBA(6, "Sarvar"), CHORSHANBA(7, "Azamat"),
    PAYSHANBA(8, "Olim"), JUMA(2, "kimdir"), SHANBA(0, "dam olish"), YAKSHANBA(0, "damolish");

    int soat;
    String ismi;

    Enums(int soat, String ismi) {
        this.soat = soat;
        this.ismi = ismi;
    }

}
