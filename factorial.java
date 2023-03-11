import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the no ");
        int n=scn.nextInt();

        System.out.println(fac(n));
    }
    public static  int  fac(int n){
       if(n==0 || n==1)
       return 1;

       return n*fac(n-1);
    }
}
