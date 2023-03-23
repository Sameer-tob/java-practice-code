import java.util.Scanner;

public class reversestr {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter the String");
            String str=scn.nextLine();

            //str=new StringBuilder(str).reverse().toString();
            //System.out.println(str);


            String reverse="";
            for(int i=str.length();i>=0;i--){
                System.out.print(reverse + str.charAt(i));
            }
            System.out.println(reverse);
        }
    }
}
