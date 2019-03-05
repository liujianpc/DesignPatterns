package iterator;

/**
 * Date: 2019/3/5
 * Created by LiuJian
 *
 * @author LiuJian
 */

interface IMenu {
    void addItem(String bookName, int price);
    Iterable<Book> createIterator();
}
