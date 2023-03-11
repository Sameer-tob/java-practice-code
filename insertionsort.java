import java.util.Scanner;

public class insertionsort{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the no of element to add in Array");
        int n=scn.nextInt();

        int arr[]=new int[n];
        System.out.println("Add Element to Array");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }


        //Display what you input
        System.out.print("Inputed Array :  ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        //Insertion Sort Algorithm
        int j,v;
        for(int i=0;i<n;i++){
            v=arr[i];
            j=i;
            while(j>0 && arr[j-1]>v){
               arr[j]=arr[j-1];
               j--;
            }
            arr[j]=v;   
        }

        //Sorted Array Display
        System.out.print("Sorted Array  :  ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }      

    }
}