package BookDiscount;

public class TenPercentOff implements Discount{
    @Override
    public double count(Order order){
        double sum = 0;
        for(int i = 0; i < order.list.size(); i ++){
            sum += order.list.get(i).price;
        }

        return sum * 0.9;
    }
}
