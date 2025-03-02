import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=1;i<=2*n;i++){
            if(i<=n){
            for(int k=1;k<i;k++){
                System.out.print(" ");
            }
            for(int j=n;j>=i;j--){
                System.out.print(" *");
            }
            System.out.println();
        }
        else{ 

            for(int k=1;k<=2*n-i+1;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i-n;j++){
               System.out.print("* ");
            }
          System.out.println(" ");
        }

    }
    in.close();
    }
}
