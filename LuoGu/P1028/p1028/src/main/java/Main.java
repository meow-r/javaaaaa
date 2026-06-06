import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int[] count = new int[n+1];
        count[0] = 0;
        count[1] = 1;
        for(int i = 2; i <= n; i ++){
            count[i] = 1;
            for(int j = 0; j <= i/2; j ++){
                count[i] += count[j];
            }
        }

        System.out.println(count[n]);
    }
}