import java.util.HashSet;
import java.util.Scanner;

public class removeDuplicate {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            //Size of Array
            System.out.println("Enter the Size of Array");
            int n=scn.nextInt();

            //add Element to the Array
            System.out.println("Add Element to the Array");
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scn.nextInt();
            }

            System.out.println("Entered Array");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+ " ");
            }

            HashSet<Integer> set=new HashSet<>();
            for(int i=0;i<n;i++){
                set.add(arr[i]);
            }
            System.out.println("\nAfter Removing duplicate\n"+set);
        }

    }
}
