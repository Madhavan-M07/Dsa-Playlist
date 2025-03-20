import java.util.Scanner;

public class gcd_optimal {
    public static int gcdOptimal(int a , int b){
        while (a>0 && b>0){
           if(a>b){
            a = a % b;
           }
           else{
            b = b % a;
           }
        }
           if(a==0){
            return b;
           }
           else{
            return a;
           }
        }
       
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int gcd = gcdOptimal(n1,n2);
        System.out.print(gcd);
        in.close();
    
    }
}
