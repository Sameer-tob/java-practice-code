import java.util.Scanner;

public class missingArray {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            
            System.out.println("Define the Size of Array");
            int n=scn.nextInt();

            System.out.println("Add Element in sorted order");
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scn.nextInt();
            }

            System.out.println("Entered Array : ");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }

            int totalSum=n*(n+1)/2;
            int arraySum=0;
            for(int i=0;i<n-1;i++){
                arraySum+=arr[i];
            }

            System.out.println("\nMissing Element in Array : "+ (totalSum-arraySum));

        }
    }
}
