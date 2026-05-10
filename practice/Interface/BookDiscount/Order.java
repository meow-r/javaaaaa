package BookDiscount;

import java.util.*;

public class Order {
    List<Book> list;

    public Order(){
        list = new ArrayList<>();
    }

    public void add(Book book){
        list.add(book);
    }
}
