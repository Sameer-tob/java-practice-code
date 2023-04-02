import java.util.Scanner;

public class twoArray {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Size of Array n x m");
        int n=scn.nextInt();
        int m=scn.nextInt();

        System.out.println("Add Element to the Array");
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scn.nextInt();
            }
        }

        System.out.println("Entered Array : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println(arr[i][j] + " ");
            }
        }
    }
}
