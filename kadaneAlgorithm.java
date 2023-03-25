import java.util.*;

public class kadaneAlgorithm {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        //Size of Array
        System.out.println("Enter the Size of the Array");
        int n=scn.nextInt();

        //Add element in the Array
        System.out.println("Add Element to the array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        //Display the Enetered Array
        System.out.println("Entered Array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }


        System.out.println("\nMax subarray sum : " + maxSubarray(arr,n));
    }
    
    static int maxSubarray(int arr[],int n){
        
        // Initialize maxSum with minimum value
        int maxSum=Integer.MIN_VALUE;

        //initilize currentSum with value 0
        int currSum=0;
        
        //iterate over each array element to find which subarray has maximum sum
        for(int i=0;i<n;i++){
            currSum=currSum+arr[i];
            if(currSum>maxSum)
            maxSum=currSum;
            
            if(currSum<0)
            currSum=0;
        }
        return maxSum;
    }
}
