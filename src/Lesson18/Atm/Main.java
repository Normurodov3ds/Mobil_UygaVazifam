package Lesson18.Atm;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Money> monies = new ArrayList<>();
        Atm atm = new Atm();
        monies.add(new Money(100, 500_000));
        monies.add(new Money(50, 100_000));
        monies.add(new Money(1, 10_000));
        monies.add(new Money(50, 100_000));
        monies.add(new Money(50, 100_000)); // double add
        monies.add(new Money(200, 1_000_000));
        monies.add(new Money(10, 70_000));
        monies.add(new Money(5, 20_000));
        monies.add(new Money(20, 40_000));
        monies.add(new Money(2, 10_000));

        atm.addMony(monies);
        atm.monyInfo();
        atm.isGetMony(562_000);
        atm.monyInfo();

    }
    /** DASTUR ALGORITIMI HAQIDA.!(o'qish ni maslahat beraman)
     * 1! dasturni ishlatishi quydagicha name -> bu pul birligi masalan 200 ming talik amount -> summma
     * 2! siz 2 ta va undan ko'p bir xil birlikda summa kritsangiz 1 xil birlikka qo'sadi.! M-n.
     * 200 minglikdan 2 marta harxil amount (qiymat b-n qo'shsangiz)bitta qiymatga saqlaydi amountlar qo'shiladi.
     * 3! isGetmony() ga siz summa yozasiZ sizga iloji boricha katta birlikda summa qaytaradi.! m-n
     * siz 752 000 sum yechmoqchisiz -> 200 miglik bor bo'lsa 3 ta (600 000) va 1ta 100 minglik beardi
     * 2 miglik bo'lsa beradi yo'q bo'lsa 1 000 sum qdan 2 ta beradi.!
     * izoh bizga REAL Hayotda ham bankamat iloji boricha katta qiymatli pul qaytarishga harahat qiladi.
     * sabab chunki kichik summlardan yirigini hosil qilsa bo'ladi lekin yerikdan kichik summani hosil qilib bolmaydi.!
     * batcha algoritimlar (Atm class ichida)
     * yana bir dastur afzalligi siz 200 000 so'mlik deb 500 000 ming sum kirita olmaysiz chunki bu mantiqqa ega emas.!
     * sizdan qaytadan kiritishni so'raydi.!
     */





}
