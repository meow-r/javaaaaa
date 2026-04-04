package practice;
import java.util.Random;
import java.util.Arrays;

public class bubble {
    public static void main (String[] args){
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i ++){
            arr[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort (int[] arr){
        for (int i = 0; i < arr.length; i ++){
            for (int j = 1; j < arr.length-i; j ++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
