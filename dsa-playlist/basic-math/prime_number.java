import java.util.Scanner;
public class prime_number {

   static boolean findPrime(int n){
   
        int count = 0;
        for(int i = 1;i*i<=n;i++){
            if(n%i==0){
                count++;
            
            if(i!=n/i){
                count++;
            }
        }
    }
    
        // if(count==2){
        //     return true;
        // }
        // if(count>2){
        //     return false;
        // }
        return count==2;
    
       }
   public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       boolean isPrime = findPrime(n);
       if(isPrime){
        System.out.print(n + " is a prime Number");
       }
       else{
        System.out.print(n + " is not a prime Number");
       }

       in.close();

   } 

}
