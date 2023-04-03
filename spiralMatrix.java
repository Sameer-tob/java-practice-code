import java.util.ArrayList;
import java.util.Scanner;

public class spiralMatrix {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Size of Array (N x M)");
            int n=scn.nextInt();
            int m=scn.nextInt();

            System.out.println("Add Element to the Matrix (N x M)");
            int arr[][]=new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    arr[i][j]=scn.nextInt();
                }
            }

            System.out.println("Your Matrix ");
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

            int left=0;
            int right=m-1;
            int top=0;
            int bottom=n-1;

            //create an ArrayList to add new Spiraled matrix
            ArrayList<Integer> list =new ArrayList<>();

        while(top<=bottom && left<=right){

            for(int i=left;i<=right;i++){
                list.add(arr[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                list.add(arr[i][right]);
            }
            right--;
            for(int i=right;i>=left;i--){
                list.add(arr[bottom][i]);
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                list.add(arr[i][left]);
            }
            left++;

        }

        System.out.println("Spiraled Matrix : " + list);

            
        }

    }
}
