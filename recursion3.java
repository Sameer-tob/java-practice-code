import java.util.Scanner;

public class recursion3 {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter the no");
            int n=scn.nextInt();

            printNo(n);
        }
    }
    static void printNo(int n){
        if(n==0)
        return;
         
        System.out.print(n+ " ");
        printNo(n-1);
    }
}
