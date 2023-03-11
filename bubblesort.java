import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
       
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the no of Element want to add in Array");
        int n=scn.nextInt();

        System.out.println("Enter the Array Element");
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
         
        //What you input
        System.out.println("Your inputed Array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

        
        // Bubble Sort Algorithm
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                //swap
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }
            }
        }

        //Sorted Array
        System.out.println("\nSorted Array : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
