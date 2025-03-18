import java.util.Scanner;

public class reverse_num {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int rev = 0;
        while(n>0){
           int ld = n % 10;
            rev = rev*10 + ld;
            n/=10;
        }
        System.out.print(rev);
        in.close();
    }
   
}
