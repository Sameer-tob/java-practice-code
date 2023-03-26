import java.util.Scanner;

public class buyandsellstock1 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        //Best time to Buy and Sell stock 
        //maximize profit

        System.out.println("How many day you need to get up for the profit calculation");
        int n=scn.nextInt();

        System.out.println("Add Price of Stocks on each day");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        System.out.print("Price on each day : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nMaximum profit that can be earned is : " + maxProfit(arr,n));
    }
    static int maxProfit(int arr[],int n){

        int miniAmount=arr[0];
        int profit=0;
        for(int i=1;i<n;i++){
            int marginCost=arr[i]-miniAmount;
            profit=Math.max(profit, marginCost);
            miniAmount=Math.min(miniAmount, arr[i]);
        }

        return profit;
    }
}
