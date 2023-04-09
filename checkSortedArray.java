import java.util.Scanner;

public class checkSortedArray {
    public static void main(String[] args) {

        //Check if Array is sorted or not

        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter the Size of array");
            int n=scn.nextInt();

            System.out.println("Add Element to the Array");
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scn.nextInt();
            }

            System.out.println(check(arr,n));
        }
    }
    
    static boolean check(int arr[],int n){
        for(int i=1;i<n;i++){
            if(arr[i-1]<arr[i]){
                
            }
            else
            return false;
        }
        return true;
    }
}
