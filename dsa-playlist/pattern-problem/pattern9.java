import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=n;i++){
            for(int k =1 ; k < i ; k++){
                System.out.print(" ");
            }
            for(int j=2*n-i;j>=i;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        in.close();
    }
}
