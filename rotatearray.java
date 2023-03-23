import java.util.Scanner;

public class rotatearray {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter the size of array");
            int n=scn.nextInt();

            System.out.println("add Element to the Array");
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scn.nextInt();
            }

            System.out.print("Entered Array : ");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }

            System.out.println("\nUpto how much Place you want to Left Rotate an Array");
            int k=scn.nextInt();

            rotate(arr,n,k);

            System.out.print("Rotated Array : ");
            for(int i=0;i<n;i++){
                System.out.print(arr[i] + " ");
            }
        }

    }

    static void rotate(int arr[] ,int n,int k){
        k=k%n;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }
    
    static void reverse(int arr[],int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
