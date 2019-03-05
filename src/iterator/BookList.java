package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 2019/3/4
 * Created by LiuJian
 *
 * @author LiuJian
 */

class BookList implements IMenu {
    List<Book> books;

    BookList() {
        books = new ArrayList<>();
        addItem("Java", 60);
        addItem("Python", 50);
        addItem("Go", 40);
        addItem("C++", 30);
    }

    public void addItem(String bookName, int price) {
        books.add(new Book(bookName, price));
    }

    public Iterable<Book> createIterator(){
        return new BookListIterator(this.books);
    }
}
