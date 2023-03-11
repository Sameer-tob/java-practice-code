import java.util.*;
public class quicksort{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enetr the no of Element to add in array");
        int n=scn.nextInt();

        int arr[]=new int[n];
        System.out.println("Add element to the array");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        // your inputed array
        System.out.print("Inputed Array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //quicksort Algorithm
        int low=arr[0];
        int high=arr[n-1];
        int pivot=arr[(low+high)/2];

        while(low<=high){
            
            while(arr[low]<pivot){
                low++;
            }
            
            while(arr[high]>=pivot){
                high--;
            }
            
            if(low<=high){
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                
                
                low++;
                high--;
            }
        }
        
        System.out.println("Sorted Array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}