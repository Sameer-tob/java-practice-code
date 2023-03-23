import java.util.Scanner;

public class recursion4 {
    public static void main(String[] args) {
     try (Scanner scn = new Scanner(System.in)) {
        System.out.println("Enter the no");
         int n=scn.nextInt();

        System.out.println(sumofnaturalno(n));
    }
    }
    static int sumofnaturalno(int n){
        if(n==1)
        return 1;

        return n + sumofnaturalno(n-1);
    }
}
