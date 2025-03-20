import java.util.*;
public class gcd {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int gcd = 1;
        for(int i =1;i<=Math.min(n1,n2);i++){
            if(n1%i==0 && n2%i==0){
                gcd = i;
        }
    }
        System.out.print(gcd);
       in.close();

    }
}
