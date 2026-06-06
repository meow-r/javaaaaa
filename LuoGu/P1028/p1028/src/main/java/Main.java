import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        C c = new C();
        int countOfN = c.count(n) ;

        System.out.println(countOfN);
    }

}

class C {
    public int count(int n){
        if(n == 1){
            return 1;
        }
        int t = 0;
        int count = 1;
        while(count <= n / 2){
            t += count(count);
            count ++;
        }
        return t + 1;
    }
}