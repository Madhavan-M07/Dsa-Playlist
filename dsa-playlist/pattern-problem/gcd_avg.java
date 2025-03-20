import java.util.Scanner;

public class gcd_avg {

    public static int findGcd(int n1 , int n2){
         for(int i = Math.min(n1,n2); i>0;i++){
            if(n1%i==0 && n2%i==0){
                return i;
            }
         }
         return 1;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int gcd = findGcd(n1, n2);
        System.out.print(gcd);
        in.close();
      
    }
}
