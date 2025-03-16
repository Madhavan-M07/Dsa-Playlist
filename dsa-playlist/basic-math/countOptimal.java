import java.util.Scanner;

public class countOptimal {
     public static int digitCount(int n){
        if(n==0) return 1;
         int count = (int)(Math.log10(Math.abs(n)) + 1);
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
