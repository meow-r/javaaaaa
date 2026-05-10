import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String target = sc.nextLine();
        String input = sc.nextLine();
        String[] context = input.trim().split(" ");
        int indexOfResult = -1;
        boolean first = true;
        int count = 0;
        int index = 0;
        for(int i = 0; i < context.length; i ++){
            index = input.indexOf(context[i], index) + context[i].length();
            if(context[i].equalsIgnoreCase(target)){
                count ++;
                if(first){
                    indexOfResult = index;
                    first = false;
                }
            }
        }

        if(first){
            System.out.print(indexOfResult);
        }else{
            System.out.println(count + " " + indexOfResult);
        }

        sc.close();
    }
}