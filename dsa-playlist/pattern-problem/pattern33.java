import java.util.Scanner;

public class pattern33 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char ch = 'a';
        for(int i = 0;i<n;i++){
           for(int j=0;j<=i;j++){
              if((i+j)%2==0){
                System.out.print(ch + " ");
              }
              else{
                    System.out.print(Character.toUpperCase(ch) + " ");
              }
              ch++;
           }

           System.out.println();
        }
        in.close();
    }
}
