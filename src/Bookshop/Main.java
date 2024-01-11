package Bookshop;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("o'tgan kunlar",20_000);
        Book book1 = new Book("Qorakuz majnun",10_000);
        Book book2 = new Book("Shaytanat",50_000);
        Book book3 = new Book("Ufq",20_000);
        BookShop bookShop = new BookShop("Books STORE",20_000_000);
        bookShop.buyBook(book,2);
        bookShop.buyBook(book1,5);
        bookShop.buyBook(book2,5);
        bookShop.buyBook(book3,5);

        System.out.println(bookShop.sell(book, 5));
        System.out.println(bookShop.sell(book1, 5));
        System.out.println(bookShop.sell(book2, 5));


    }
}
