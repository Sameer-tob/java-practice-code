import java.time.*;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Instant start=Instant.now();

        try (Scanner scn = new Scanner(System.in)) {
        
            System.out.println("Enter the no ");
            int n=scn.nextInt();

            System.out.println(fac(n));
        }
        
        Instant end=Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("\nTotal time taken to execute this code : " + timeElapsed.toSeconds() + " milliseconds");
    }
    
    static  long  fac(int n){
        //base cndition
        if(n==0 || n==1)
        return 1;

       return n*fac(n-1);
    }
}
