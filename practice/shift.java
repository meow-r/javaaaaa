package practice;
import java.util.Random;
import java.util.Arrays;

public class shift{
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i ++){
            arr[i] = rand.nextInt(100);
        }

        System.out.println("原数组：" + Arrays.toString(arr));

        int left = 0;
        int right = arr.length-1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left ++;
            right --;
        }

        System.out.println("new arr:" + Arrays.toString(arr));
    }
}