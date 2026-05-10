package BookDiscount;

public class Main {
    public static void main(String[] args){
        Order order = new Order();

        order.add(new Book("111", 33));
        order.add(new Book("222", 222));
        order.add(new Book("131", 555));

        System.out.println((new NoDiscount()).count(order));
    }
}
