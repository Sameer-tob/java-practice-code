import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class longestSequence {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n=scn.nextInt();

        System.out.println("Add Element to the Array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        System.out.print("Entered Array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        
        Arrays.sort(arr);
        
        System.out.print("\nSorted Array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

        //LongestSequence fucton invoke
        System.out.println("\nLongest consecutive Sequence in an array : " + longestSequence(arr,n));

    }
    static int longestSequence(int arr[],int n){

        Arrays.sort(arr);

        int longest=0;
        int count=0;
        int lastsum=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]-1==lastsum){
                count++;
                lastsum=arr[i];
            }
            else if(arr[i]!=lastsum){
                count=1;
                lastsum=arr[i];
            }
            longest=Math.max(longest, count);
        }           
        return longest;
    }
}
