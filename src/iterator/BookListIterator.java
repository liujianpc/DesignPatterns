package iterator;

import java.util.List;

/**
 * Date: 2019/3/4
 * Created by LiuJian
 *
 * @author LiuJian
 */

/**
 * 迭代器模式：
 * 两个类的存储元素方式数据结构不一致时，可以使用迭代器模式去统一遍历
 * 具体步骤：
 * 1、构造两个类对应的迭代器
 * 2、在两个类中分别构造获取迭代器的方法
 * 3、使用迭代器遍历
 */
class BookListIterator implements Iterable<Book> {
    List<Book> books;
    int postion;

    public BookListIterator(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return postion < books.size() && books.get(postion) != null;
    }

    @Override
    public Book next() {
        if (postion < books.size()) {

            return books.get(postion++);
        }
        return null;
    }
}
