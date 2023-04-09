import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
       
        Instant start = Instant.now();
        // Your code here

        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter the Size of an Array");
            int n=scn.nextInt();

            System.out.println("Add Element to the Array");
            int arr[]=new int[n];

            for(int i=0;i<n;i++){
                arr[i]=scn.nextInt();
            }
             
            //What you input
            System.out.println("Entered Array : ");
            for(int i=0;i<n;i++){
                System.out.print(arr[i] + " ");
            }

            
            // Bubble Sort Algorithm
            for(int i=0;i<n-1;i++){
                for(int j=0;j<n-1-i;j++){
                    if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    }
                }
            }

            //print Sorted Array
            System.out.println("\nSorted Array : ");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i] + " ");
            }
        }
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("\nTotal time taken to execute this code : " + timeElapsed.toMillis() + " milliseconds");

    }
}
