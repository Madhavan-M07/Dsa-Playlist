import java.util.Scanner;

public class pattern28 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n;i++){
            for(int k=0;k<n-i-1;k++){
                System.out.print(" ");
            }
            for(int j=0; j<=i;j++){
                System.out.print(" *");
            }
           System.out.println();
        }
       
        for(int i = n-1;i>=1;i--){
            for(int k=0;k<=n-i-1;k++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(" *");
            }
            System.out.println();
        }
        in.close();
    }
}
