import java.util.*;

public class kadaneAlgorithm {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int n=scn.nextInt();

        System.out.println("Add Element to the array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        System.out.println("Entered Array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nMax subarray sum : ");
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<n;i++){
            currSum=currSum+arr[i];
            if(currSum>maxSum)
            maxSum=currSum;
            if(currSum<0)
            currSum=0;
        }
        System.out.println(maxSum);
    }
}
