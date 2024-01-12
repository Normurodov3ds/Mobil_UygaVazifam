package Lesson15.Enums;

public class Main {
    public static void main(String[] args) {
        A a = new A(20,30,35,"Komil");
        B b = new B(40,47,36,45,"Sarvar");
        System.out.printf("%.1f",a.getprastage());
        System.out.println("% foiz o'zlashtirish");
        System.out.printf("%.1f",b.getprastage());
        System.out.println("% foiz o'zlashtirish");

    }
}
/**
 * 1) A guruh o‘quvchilarining uchta fandan (har bir fan 100 ballik sistemada)
 * va B guruh o‘quvchilarining to‘rtta fandan (har bir fan 100 ballik sistemada)
 * olgan ballari foizini hisoblash uchun “Ballar” deb nomlangan abstrakt sinf kerak.
 * Bu sinfda “getPercentage” mavhum metodi bo‘lishi kerak, boshqa ikkita sinf “A” va “B” meros qilib oladi.
 * Talabalar foizini ta'minlovchi "getPercentage" usuli "A" va "B" sinflari tomonidan qo'llaniladi.
 * “A” klassi konstruktori uchta fan bo‘yicha olingan baholarni o‘z parametrlari sifatida,
 * “B” sinf konstruktori esa to‘rtta fan bo‘yicha olingan baholarni o‘z parametrlari sifatida qabul qiladi.
 * Amalga oshirishni sinab ko'rish uchun ikkala sinf uchun ob'ektlar yaratilishi
 * va har bir talaba uchun baholar foizini chop etish kerak.
 * <p>
 * Interface va abstract class orqali bajarilsin
 */