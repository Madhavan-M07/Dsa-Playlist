import java.util.Scanner;

public class pattern32 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1);
        }
        for(int k=0;k<2*(n-i-1);k++){
            System.out.print(" ");
        }

        for(int j=i+1;j>=1;j--){
            System.out.print(j);
        }
      System.out.println();
    }
    in.close();
}
}