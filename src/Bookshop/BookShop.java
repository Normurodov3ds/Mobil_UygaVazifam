package Bookshop;

public class BookShop {
    private String name;
    private double sum;
    Book[] books = new Book[]{};


    public BookShop(String name, double sum) {
        this.name = name;
        this.sum = sum;

    }

    public int buyBook(Book book, int count) {
        if (sum >= (count * book.getCost())) {
            sum -= (count * book.getCost());
            Book[] books1 = new Book[books.length + 1];
            for (int i = 0; i < books.length; i++) {
                books1[i] = books[i];
            }
            book.setSum(count);
            books1[books.length] = book;
            books = books1;
            return count;
        }
        return 0;
    }

    public boolean hasbook() {
        return sum > 0;
    }

    public boolean hasbook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (book.getName().equalsIgnoreCase(books[i].getName())) {
                return true;
            }
        }
        return false;
    }

    //    public void showInfo(){
//        System.out.println("=============");
//        System.out.println(name+ " nomli kutob do'koni");
//        for (int i = 0; i < books.length; i++) {
//            System.out.println((1+i)+" - sotuv");
//            System.out.println(books[i].getName()+" kintob");
//            System.out.println(books[i].getCost()+" so'mlik");
//            System.out.println(books[i].getSum()+" so'glik savdo");
//            System.out.println(books[i].getSum()/books[i].getCost()+" ta sotildi");
//            System.out.println(sum + " so'm  kassada qoldi ");
//            System.out.println("=============");
//        }
//    }
    public void getMony() {
        System.out.println(sum + " so'm");
    }

    public int sell(Book book, int count) {
        for (int i = 0; i < books.length; i++) {
            if (book.getName().equalsIgnoreCase(books[i].getName()) && count <= books[i].getSum()) {
                books[i].setSum(books[i].getSum()-count);
                return count;
            }
        }
        return 0;
    }
    public int getCount(Book book){
        for (int i = 0; i < books.length; i++) {
            if (book.getName().equalsIgnoreCase(books[i].getName())) {
                return books[i].getSum();
            }
        }
        return 0;
    }



}
