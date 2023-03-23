import java.util.HashSet;
import java.util.Scanner;

public class unionArray {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter the Size of Array1");
            int n=scn.nextInt();
            System.out.println("Add Element to the Array1[]");
            int arr1[]=new int[n];
            for(int i=0;i<n;i++){
                arr1[i]=scn.nextInt();
            }

            System.out.println("Enter the Size of Array2");
            int m=scn.nextInt();
            System.out.println("Add Element to the Array2[]");
            int arr2[]=new int[m];
            for(int i=0;i<n;i++){
                arr2[i]=scn.nextInt();
            }
            System.out.print("\nArray1 : ");
            for(int i=0;i<n;i++){
                System.out.print(arr1[i]+ " ");
            }


            System.out.print("\nArray2 : ");
            for(int i=0;i<m;i++){
                System.out.print(arr2[i]+ " ");
            }
            HashSet<Integer> set=new HashSet<>();
            for(int i=0;i<n;i++){
                set.add(arr1[i]);
            }
            for(int i=0;i<m;i++){
                set.add(arr2[i]);
            }

            System.out.println("\nUnion of Array1 & Array2");
            System.out.println(set);
        }
    }
}
