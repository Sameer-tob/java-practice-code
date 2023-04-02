import java.util.Scanner;

public class transposeMatrix {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Size of matrix n x m");
        int n=scn.nextInt();
        int m=scn.nextInt();

        System.out.println("add element to the Matrix");
        int matrix[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=scn.nextInt();
            }
        }

        System.out.print("\nEntered matrix : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print(matrix[i][j] + " ");
            }
        }

        //Transpose Logic

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        System.out.print("\nTransposed matrix : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
