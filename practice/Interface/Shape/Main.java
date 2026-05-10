package Shape;

import java.util.*;

public class Main {
    public static void main(String[] args){
        ArrayList<Shape> arr = new ArrayList<>();

        arr.add(new Circle(5));
        arr.add(new Rectangle(3.3, 6));

        for(int i = 0; i < arr.size(); i ++){
            System.out.println(arr.get(i).area());
        }
    }
}
