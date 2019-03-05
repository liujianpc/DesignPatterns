package iterator;

/**
 * Date: 2019/3/4
 * Created by LiuJian
 *
 * @author LiuJian
 */

class BookArray implements IMenu {

    Book[] books;
    private static final int MAX_THRESHOLD = 10;
    private int index = 0;

    BookArray() {
        books = new Book[MAX_THRESHOLD];
        addItem("Java", 60);
        addItem("DataStructure", 80);
        addItem("bigData", 90);
        addItem("Android", 100);
    }

    public void addItem(String bookName, int price) {
        books[index] = new Book(bookName, price);
        index++;
    }

    public Iterable<Book> createIterator() {
        return new BookArrayIterator(this.books);
    }
}
