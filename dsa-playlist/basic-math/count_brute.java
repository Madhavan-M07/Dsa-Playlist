import java.util.*;
public class count_brute{

    public static int digitCount(int n){
        int count = 0;
        while(n>0){
            count++;
            n /=10;
        }
        return count;
    }
    public static void main(String[] args){
         Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         int digit = digitCount(n);
         System.out.print("Number of digits in given " + n + " is " + digit );
         in.close();

    }

}
