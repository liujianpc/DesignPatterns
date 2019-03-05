package iterator;

/**
 * Date: 2019/3/4
 * Created by LiuJian
 *
 * @author LiuJian
 */

class Main {

    public static void main(String[] args) {
        IMenu bookArray = new BookArray();
        printItem(bookArray.createIterator());

        IMenu bookList = new BookList();
        printItem(bookList.createIterator());

    }

    private static void printItem(Iterable<Book> iterator) {
        while (iterator.hasNext()) {
            Book item = iterator.next();
            System.out.println(item.getBookName() + "-" + item.getPrice());
        }
    }
}
