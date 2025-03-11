import java.util.Scanner;

public class pattern34 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char ch = 'E';
        for(int i = 0;i<5;i++){
         char temp = (char)(ch-i);
        for(int j=n-1;j>=i;j--){
            System.out.print(temp + " ");
            temp--;
        }
        System.out.println();
    }
    in.close();
}
}
