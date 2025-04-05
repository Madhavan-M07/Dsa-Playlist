import java.util.Scanner;

public class countfrqfunc {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
         
        // Read Size of Array
        System.out.print("Enter size of array :");
        int n = in.nextInt();

        // Declare and ready array Elements
        int[] a = new int[n];
        System.out.println("Enter Array  Elements: ");
        for(int i = 0 ; i<n;i++){
            a[i] = in.nextInt();
        }
        // Read the number to count 
        System.out.print("Enter number to find frequency:");
        int number = in.nextInt();
        // call frequncy function 
        int freq = frequency(number , a);
        System.out.println("Frequency of " + number + " is:" +freq);

        in.close();
    }

    public static int frequency(int number , int[] a){
        int cnt = 0;
        for(int i = 0;i<a.length;i++){
            if(a[i]==number){
                cnt++;
            }
        }
        return cnt;
    }
   
}
