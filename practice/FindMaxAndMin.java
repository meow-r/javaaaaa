package practice;

import java.util.Random;

public class FindMaxAndMin {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i ++){
            arr[i] = rand.nextInt(100);
        }
        
        int min = arr[0];
        int max = arr[0];
        int indexOfMin = 0;
        int indexOfMax = 0;

        for (int i = 0; i < arr.length; i ++){
            if(arr[i] > max){
                max = arr[i];
                indexOfMax = i;
            }
            if(arr[i] < min){
                min = arr[i];
                indexOfMin = i;
            }
        }

        System.out.printf("max: %d indexOfMax: %d\n",max, indexOfMax);
        System.out.printf("min: %d indexOfMin: %d",min, indexOfMin);
    }
}
    