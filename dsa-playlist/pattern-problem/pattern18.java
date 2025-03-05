import java.util.Scanner;

public class pattern18 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num = 2*n;
        for(int i=1;i<=n;i++){
            //left 5 star
            for(int j=1;j<=num/2-(i-1);j++){
                System.out.print("*");
            }
            // no spaces
            for(int k=1;k<=2*(i-1);k++){
               System.out.print(" ");
            }
            for(int j=1;j<=num/2-(i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            } 
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        in.close();
    }
}
