import java.util.Scanner;

public class rowMax1s {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the Matrix size n x m ");
        int n=scn.nextInt();
        int m=scn.nextInt();

        System.out.println("Add Element to the Matrix");
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scn.nextInt();
            }
        }

        System.out.println("Entered Matrix ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The row(0-Based Indexing) which contain maximum 1's : "+rowWithMaximum1s(arr,n,m));

    }
    static int rowWithMaximum1s(int arr[][],int n,int m){
        int row=-1;
        int column=m-1;

        for(int i=0;i<n;i++){
            for(int j=column;j>=0;j--){
                if(arr[i][j]==1){
                    row=i;
                    column--;
                }
                else{
                    break;
                }
            }
        }
        
        return row;
    }
    
}
