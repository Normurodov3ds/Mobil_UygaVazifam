package Lesson14.Bookshop_2;

public class BookShop {
    private String shopName;
    private double bookShop_monyAmount;

    public BookShop(String shopName, double bookShop_monyAmount) {
        this.shopName = shopName;
        this.bookShop_monyAmount = bookShop_monyAmount;
    }

    Book[] books = new Book[]{};


    public int buyBook(Book book, int count) {
        if (!hasBook(book) && bookShop_monyAmount >= book.getCost() * count) {
            Book[] books1 = new Book[books.length + 1];
            for (int i = 0; i < books.length; i++) {
                books1[i] = books[i];
            }
            books1[books.length] = book;
            books1[books.length].setCount(count);
            books = books1;
            this.bookShop_monyAmount -= book.getCost() * count;
            System.out.println(book.getName() + " kitobdan " + count + " ta sotib olindi");
            return count;
        }
        System.out.println("Sotib olinmadi.!");
        return 0;
    }

    public boolean hasBook() {

        return books.length > 0;
    }

    public boolean hasBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals(book.getName())) {
                return true;
            }
        }
        return false;
    }

    public double getMony() {
        return this.bookShop_monyAmount;
    }

    public int sell(Book book, int count) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals(book.getName())) {
                if (books[i].getCount() >= count) {
                    this.bookShop_monyAmount += (count * (books[i].getCost() * 1.2));
                    books[i].setCount(books[i].getCount() - count);
                    return count;
                }
                System.out.println("buncha kitob yo'q");
                return 0;
            }
        }
        System.out.println("bunaqa kitob yo'q");
        return 0;
    }

    public int getCount(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals(book.getName())) {
                return books[i].getCount();
            }
        }
        return 0;
    }

    public int getCount() {
        return books.length;
    }

    public void showInfo() {
        System.out.println(shopName + " kitob do'koni");
        System.out.println("===================");
        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + " - koitob ");
            System.out.println(books[i].getName() + " kitobi dan " + books[i].getCount());
            System.out.println(" narxi " + books[i].getCost() + " so'm ");
            System.out.println("===================");
        }
        System.out.println(bookShop_monyAmount + " so'm kassada qoldi");
    }

}
