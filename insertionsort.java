import java.time.*;
import java.util.*;

public class insertionsort{
    public static void main(String[] args) {

        Instant start=Instant.now();
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the no of element to add in Array");
        int n=scn.nextInt();

        int arr[]=new int[n];
        System.out.println("Add Element to Array");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }


        //Display what you input
        System.out.print("Inputed Array :  ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }


        //Insertion Sort Algorithm
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp =arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }   
        }

        //Sorted Array Display
        System.out.print("\nSorted Array  :  ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }      

        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("\nTotal time taken to execute this code : " + timeElapsed.toMillis() + " milliseconds");

    }
}