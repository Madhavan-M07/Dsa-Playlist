import java.util.Scanner;
public class countfreq_brute {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Array values you need to hash:");
        for(int i = 0 ;i<n;i++){
            arr[i] = in.nextInt();
        }



        //precompute
        int[] hash = new int[13];
        for(int i = 0;i<n;i++){
            hash[arr[i]]++;
        }

        int q;
        q = in.nextInt();
        while (q-- !=0 ){
        System.out.print("Enter the Queries each time:");
           int number = in.nextInt();
           System.out.print(hash[number]);
        }
       in.close();
    }
}
