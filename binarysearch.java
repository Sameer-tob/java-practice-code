import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            //length of Array
            System.out.println("Enter the size of Array");
            int n=scn.nextInt();

            //Add element to the Array
            int arr[]=new int[n];
            System.out.println("Add element to the Array");
            for(int i=0;i<n;i++){
                arr[i]=scn.nextInt();
            }

            
            //Element to be Searched
            System.out.println("Enter the Element to be Search in Array");
            int item=scn.nextInt();

            int low=0;
            int high=arr.length-1;
            int mid;
      
            //searching Algorithm 
            while(low<=high){
                mid=low +(high-low)/2;
                if(arr[mid]==item){
                    System.out.println("Element present at "+ mid + " index");
                    break;
                }
                else if(arr[mid]<item){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            if(low>high){
                System.out.println("Element not Found");
            }
        }

    }
}
