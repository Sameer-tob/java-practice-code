import java.util.Scanner;

public class palindromestring {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter the String to check for Palindrome");
            String s=scn.nextLine();

 //1.      
      String oString="";
      for(int i=s.length()-1;i>=0;i--){
            oString=oString+s.charAt(i);
      }
      
//2.    // String oString=s;         
            // s=new StringBuilder(s).reverse().toString();
  
            if(s.equals(oString)){
                System.out.println("Palindrome");
            }
            else{
                System.out.println("Not a Palindrome");
            }
        }
    }
}
