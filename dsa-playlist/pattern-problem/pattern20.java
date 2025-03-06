import java.util.Scanner;

public class pattern20 {
public static void main(String[] args){
    Scanner in =new Scanner(System.in);
    int n = in.nextInt();
    for(int i =1;i<=n;i++){
        for(int j=1;j<=n-1;j++){
            if(i==1||j==n-1||i==n||j==1){
              System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        
        }
        System.out.println();
    } 
in.close();
}
}
