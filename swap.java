import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter the First no ");
            int fn=scn.nextInt();


            System.out.println("Enter the Second no ");
            int sn=scn.nextInt();

            fn=fn+sn;
            sn=fn-sn;
            fn=fn-sn;

            //swapped
            System.out.println("First no " + fn);
            
            System.out.println("Second no " + sn);
        }
    }
}
