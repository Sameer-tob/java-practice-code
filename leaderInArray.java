import java.util.*;
import java.time.*;

public class leaderInArray {
    public static void main(String[] args) {
        Instant start=Instant.now();
        Scanner scn=new Scanner(System.in);
        
        System.out.println("Size of Array");
        int n=scn.nextInt();
        
        System.out.println("Add Element to the Array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        System.out.print("Entered Array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

        ArrayList<Integer> list=new ArrayList<>();
        int max=Integer.MIN_VALUE;

        for(int i=n-1;i>=0;i--){
            if(arr[i]>max){
                list.add(arr[i]);
            }
            max=Math.max(max, arr[i]);
        }
       // Collections.reverse(list);
        System.out.println("\nLeaders in an Array: " + list);
        Instant end=Instant.now();
		Duration timeElapsed=Duration.between(start, end);
		System.out.println("\nTotal time taken to complete execution of code " + timeElapsed.toMillis() + "milo second");
    }
}
