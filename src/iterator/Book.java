package iterator;

/**
 * Date: 2019/3/4
 * Created by LiuJian
 *
 * @author LiuJian
 */

class Book {

    private String bookName;
    private int price;

    Book(String bookName, int price) {
        this.bookName = bookName;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String mBookName) {
        bookName = mBookName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int mPrice) {
        price = mPrice;
    }
}
