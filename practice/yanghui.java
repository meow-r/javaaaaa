package practice;
import java.util.Scanner;
import java.util.Arrays;

public class yanghui {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();
        sc.close();

        int [][] triangle = new int[n][];
        for (int i = 0; i < n; i ++){
            triangle[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j ++){
                if (j == 0 || j == i){
                    triangle[i][j] = 1;
                }else{
                    triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
                }
            }
        }

        for (int i = 0; i < n; i ++){
            System.out.println(Arrays.toString(triangle[i]));
        }
    }
}
