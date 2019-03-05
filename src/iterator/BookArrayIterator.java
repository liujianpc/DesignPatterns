package iterator;

/**
 * Date: 2019/3/4
 * Created by LiuJian
 *
 * @author LiuJian
 */

class BookArrayIterator implements Iterable<Book> {
    private Book[] books;
    private int position;

    BookArrayIterator(Book[] books){
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        if (position >= books.length || books[position] == null) {
            return false;
        } else {
            return true;
        }

    }

    @Override
    public Book next() {
        if (position < books.length && books[position] != null) {
            return books[position++];
        }
        return null;
    }
}
