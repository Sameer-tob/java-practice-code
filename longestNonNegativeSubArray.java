import java.util.*;

public class longestNonNegativeSubArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n=scn.nextInt();

        System.out.println("Add Element to the Array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        System.out.println("Entered Array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

        // invoke function
        longestSequence(arr, n);

        System.out.println("\nLongest Non-Negative consecutive Sequence in an array : " + longestSequence(arr,n));

    }

        //longest SubArray Sequence
    static int longestSequence(int arr[],int n){

        int length=0;
        int maxSize=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                length++;
            }
            else{
                length=0;
            }
            maxSize=Math.max(maxSize, length);
        }
        return maxSize;
    }
}
