import java.util.Scanner;

public class recursion1 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the name");
        String s=scn.next();
        System.out.println("Enter the no");
        int n=scn.nextInt();


        printName(n,s);
    }
    static void printName(int n,String s){
       if(n!=0){
        System.out.println(s + " ");
        printName(n-1,s);
       }
        return;
    }

}
