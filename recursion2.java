import java.util.Scanner;

public class recursion2 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        //print 1 2 3 4 5 6 7.....n

        System.out.println("Enter the no");
        int n=scn.nextInt();

        printNo(n);
    }
    static void printNo(int n){
        if(n!=0){
            printNo(n-1);
            System.out.print(n + " ");
        }
        return ;
    }
}
