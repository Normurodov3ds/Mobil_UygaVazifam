package Lesson14.Bookshop_2;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Ufq",50_000);
        Book book1 = new Book("Jimjitlik",100_000);
        Book book2 = new Book("qorako'zmajnun",45_000);
        Book book3 = new Book("Nur",78_000);

        BookShop bookShop = new BookShop("Kitoblar olami",2_000_000);

        bookShop.buyBook(book,5);
        bookShop.buyBook(book1,10);
        bookShop.buyBook(book2,2);
        bookShop.buyBook(book3,1);

        bookShop.showInfo();

        bookShop.sell(book,3);
        bookShop.sell(book1,5);
        bookShop.sell(book2,1);
        bookShop.sell(book3,1);
        bookShop.showInfo();



    }
}
