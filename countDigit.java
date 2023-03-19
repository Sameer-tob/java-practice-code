import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class countDigit{
    public static void main(String[] args) {

        Instant start=Instant.now();

        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the no");
        long n=scn.nextLong();

        long dup=n;
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        System.out.println("No of Integer element in "+ dup + " is : " +  +count);

        Instant end=Instant.now();
        Duration timeElapsed=Duration.between(start, end);
        System.out.println("\nTotal time taken to execute this code : " + timeElapsed.toSeconds() + " milliseconds");

    }
}