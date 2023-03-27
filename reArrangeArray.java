import java.util.*;

public class reArrangeArray {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        
        System.out.println("Size of Array");
        int n=scn.nextInt();

        System.out.println("Add Element to the array");
        int[] arr = new int[n];
            for(int i=0;i<n;i++) {
                arr[i] = scn.nextInt();
            }

            System.out.print("Initially Array   : ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }

            rearrange(arr, n);

            System.out.print("\nRe-Arranged Array : ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }

        System.out.println();
    }


    static void rearrange(int arr[], int n) {
        // code here
        ArrayList<Integer> positive = new ArrayList<>();   // For Storing Positive Numbers
        ArrayList<Integer> negative = new ArrayList<>();   // For Storing Negative Numbers

        for(int i=0;i<n;i++){
            if(arr[i]>=0)
            positive.add(arr[i]);                //Add All the Positive Element
            else
            negative.add(arr[i]);               //add all the negative Element
        }

        
        int i=0,j=0;
        while(i<n){
            if(j<positive.size())
                arr[i++]=positive.get(j);
            if(j<negative.size())
                arr[i++]=negative.get(j);
            j++;
        }
        
    }
}