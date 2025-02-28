import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=2*i-1; j++){
                System.out.print("*");
            }
           System.out.println(" ");
        }
       in.close();
    }
}
