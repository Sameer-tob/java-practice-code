import java.util.Scanner;

public class addarray {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter the no of element to add in array");
            int n=scn.nextInt();

            System.out.println("Add element to the Array");
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
               arr[i]=scn.nextInt();
            }
        }
    }
}
