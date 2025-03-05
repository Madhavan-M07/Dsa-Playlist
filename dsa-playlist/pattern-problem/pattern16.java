import java.util.Scanner;

public class pattern16 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i<=n; i++){
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            int num =1;
            for(int j=1;j<=i;j++){
                System.out.print(num + " ");
                num = num *(i-j)/j;
            }
          System.out.println();
        }
        in.close();
    }
    
}
