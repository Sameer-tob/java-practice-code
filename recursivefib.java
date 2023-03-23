import java.util.Scanner;

public class recursivefib {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter the no ");
            int n=scn.nextInt();

            for(int i=0;i<n;i++){
                System.out.print(fib(i) + " ");
            }
        }
    }

    static int fib(int n){
        if(n<=1)
        return n;
        
        return fib(n-1) + fib(n-2);
    }
}
