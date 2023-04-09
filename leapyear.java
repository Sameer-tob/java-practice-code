import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter the year check for leap year");
            int year=scn.nextInt();

            if(year%400==0 || year%4==0 && year%100 != 0){
                System.out.println("Year " + year + " Leap year");
            }
            else{
                System.out.println("Year " + year + " Non -Leap Year");
            }
        }
    }
}
