package practice;
import java.util.Arrays;

public class array {
    public static void main (String[] args){
        int[] arr = new int[]{1,2,3,8,4,33,-6};
        int sum = 0;
        for (int x : arr){
            sum += x;
        }
        double ave = sum * 1.0 / arr.length;
        System.out.println("average:"+ave);
        System.out.println("neirong:"+Arrays.toString(arr));
    }
}
