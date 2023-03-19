import java.time.*;
import java.util.Scanner;


public class selectionsort {
    public static void main(String[] args) {
        
        Instant start=Instant.now();

        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the no of Element want to add in Array");
        int n=scn.nextInt();

        //User input to add element in array
        
        int arr[]=new int[n];
        System.out.println("Enter the Array Element");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        //output of what you enter in an Order

        System.out.println("Your Inputed Array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

       //  Selection Sort Algorithm

        int min;
        for(int i=0;i<n-1;i++){
            min=i;
            for(int j=i+1;j<=n-1;j++){
                if(arr[j]<arr[min]){
                   min=j;
                }
            }
            //swap
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }

        //Sorted Array 
        System.out.println("\nSorted Array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }

        Instant end=Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("\nTotal time taken to execute this code : " + timeElapsed.toMillis() + " milliseconds");
    }
}
