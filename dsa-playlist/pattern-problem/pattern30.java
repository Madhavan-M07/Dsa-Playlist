import java.util.Scanner;

public class pattern30 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i<n;i++){
            for(int k = 0; k<n-i-1;k++){
                System.out.print(" ");
            }
            for(int j=i;j>=0;j--){
                System.out.print(j+1);
            }
            for(int j=1;j<=i;j++){  
                System.out.print(j+1);
            }
            System.out.println();
        }
        in.close();
    }
}
