import java.util.Scanner;

public class largestarray {
    public static void main(String[] args) {

        //Find the largest Element in the Array

        try (Scanner scn = new Scanner(System.in)) {
            //Size of Array
            System.out.println("Enter the Size of array");
            int n=scn.nextInt();

            //Add Element to Array
            System.out.println("Add Element to the Array");
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scn.nextInt();
            }

            //Assume largest no as arr[0]
            int largest=arr[0];
            for(int i=0;i<arr.length;i++){
                if(arr[i]>largest){
                    largest=arr[i];
                }
            }

            System.out.println("Largest no in array is : " + largest );
        }
    }
}
