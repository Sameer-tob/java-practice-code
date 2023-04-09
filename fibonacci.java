import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter the Nth fibonacci ");
            int n=scn.nextInt();

/*       System.out.println("Fibonacci no :  " +fib(n));        
   
        static int fib(int n){
            if(n<=1)
            return 1;
      
           return fib(n-1)+ fib(n-2);
*/
   
            int a=0;
            int b=1;
            System.out.print("1 ");
            for(int i=1;i<n;i++){
                if(n<1){
                
                }            
                else if(n>=1){
                    int c=a+b;
                    System.out.print(c + " ");
                    a=b;
                    b=c;
                }
            }
        }      
    }
}
