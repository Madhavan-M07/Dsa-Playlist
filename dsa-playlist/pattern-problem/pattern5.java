import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i<=2*n-1;i++){
            int num = i > n ? 2*n-i : i;
            for(int j=1;j<=num;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        in.close();
    }
}
