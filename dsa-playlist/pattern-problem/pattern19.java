import java.util.Scanner;

public class pattern19 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i =1;i<=n;i++){
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

        for(int i =1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*i;k++){
                System.out.print(" ");
            }

            for(int j=1;j<=(n-i);j++){
                System.out.print("*");
            }
            System.out.println();
        }
         in.close();
    }
    
}
