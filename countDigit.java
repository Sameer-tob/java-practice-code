import java.util.Scanner;

public class countDigit{
    public static void main(String[] args) {
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

    }
}