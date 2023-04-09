import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            
            System.out.println("Enter the no");
            int no=scn.nextInt();

            int temp=no;

            int rev=0,rem;
            while(temp!=0){
                rem=temp%10;
                rev=rev*10+rem;
                temp=temp/10;
            }

            if (no==rev) {
                System.out.println("Palindrome No : ");
            } else {
                System.out.println("Not Palindrome : ");
            }
        }
    }
}
