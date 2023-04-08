import java.util.Scanner;

public class sol {
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
    }
}
