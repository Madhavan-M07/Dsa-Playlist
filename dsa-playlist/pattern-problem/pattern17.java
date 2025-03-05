import java.util.Scanner;

public class pattern17 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i =1 ;i<=n-1;i++){
            for(int k = 1 ; k<=n-i;k++){
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        for(int i=n-2;i>=1;i--){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            for(int j=2;j<=i;j++){
                System.out.print(j);
            }

            System.out.println();
        }

        in.close();
    }
    
}
