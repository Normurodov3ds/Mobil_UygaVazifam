package Lesson20;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Queue<String> queue1 = new ArrayDeque<>();
        Queue<String> queue2 = new PriorityQueue<>();
   //   Queue<String> queue3 = new ArrayList<>(); ? nima uchunligi haqida
        queue.add("salom");
     //   System.out.println(queue1.remove());

        /**  Javada "Queue" -> tarjimasi navbat
         *  Umuman olganda Queue(interfase) Collection interfasidan extend qilgan.!
         *  unda collectionninig metodlari Queda ishlatsak bo'arkan demak.
         *  lekin Queue Interfase taqdim qilgan metodlar ham bor bular:
         */

        if (queue.offer("Komil")) { // elemen qo'shadi va true yoki false qaytaradi.
            System.out.println(queue);// bu nima uchun kk shunchaki qo'sh qo'sha olmasang hechnarsa qilma
                                        // bo'sa bolmasdimi?
        }

        /**
         * ro'yxatga null qiymat qoshsa bo'adi
         */

//        if (queue.offer(null)) {
//            System.out.println("salom");
//            System.out.println(queue);
//        }
        /**
         * ro'yxat boshidagi elementni qaytaradi o'chiradi va qaytaradi.!
         */
        System.out.println(queue.poll());
        System.out.println(queue.remove());

        /**
         * ro'yxat boshidagi elementni qaytaradi o'chiradi va qaytaradi.! ikkalsini farqi royxat bo'sh bo'sa
         * remove() xarolik beradi.! NoSuchElementException bearekan
         * peek() ro'yxat boshidagi elementni qaytaradi ochirmaydi.!
         * element() han shunaqa faqat hatolik beradi agar topa olmasa
         */


        /**
         *  First Input First Output - Birinchi Kelgan Birinchi Ketadi
         *  demak queue dan implement olgan claslar aynan FIFO tartibida ishlaydi.!
         */

        /**
         *  Deque - chi/FIFO) yoki stek (oxirgi kelgan birinchi
         * chiqadi/LIFO) sifatida ishlatilishi mumkin. Deque - ikki tomonlama navbatning
         * qisqartmasi
         */
        Deque<String> deque = new ArrayDeque<>();
        Deque<String> deque1 = new LinkedList<>();
//        deque.addFirst("salom");
//        deque.addLast("komil");
//        System.out.println(deque.peek());

        /**
         * ArrayDeque elementlarni massivda saqlaydi va oldingi va orqa uchlari
         * orasiga elementlarni oldinga va orqaga qoʻshish, olib tashlash va oʻtkazish
         * boʻyicha tezkor operatsiyalarni taʼminlaydi.
         * U Queue va Deque interfeyslarining funksiyalarini birlashtiradi va bitta class
         * sifatida ishlaydi.
         * ArrayDeque kichik sigʻimdan boshlanadi va kerak boʻlganda oʻlchamini
         * dinamik ravishda oʻzgartiradi.
         * ArrayDeque ham Queue, ham Deque-ni amalga oshiradi. U har ikki
         * tomondan dinamik ravishda o'zgartirilishi mumkin
         */

        /**
         * PriorityQueue prioritetga asoslangandir. Ya'ni qandaydir ustuvorlikka asoslangan
         * navbat deb tarjima qilinadi.
         * PriorityQueue class si o'zi hech qanday metodlarni taqdim etmagan
         * O'lchami o'zgaruvchan yoki O'suvchan array. Ya'ni elementlarni saqlash uchun
         * array dan foydalanadi. Array to'lsa o'zi avtomatik ravishda razmeri o'zgaradi.
         * Ro'yxatga qo'shish qandaydir prioritet/tartib asosida bo'ladi. Ya'ni elementlar
         * qandaydir ustuvorlik bo'yicha qo'shiladi
         * Prioritet (ustuvorlik) Default Natural Sorting Order (Odatiy Tabiiy Tartiblash
         * Tartibi) bo'lishi yoki Comparator tomonidan berilgan tartiblash bo'lishi mumkin
         * Dublikat elementlar qo'shish mumkin
         * Null qiymat kiritish mumkin emas
         */

    }
}
