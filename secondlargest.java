import java.util.Scanner;

public class secondlargest {
    public static void main(String[] args) {
        
        //Find the second largest Element in the array
        
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter size of the Array");
            int n=scn.nextInt();

            System.out.println("Add Element to the Array");
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scn.nextInt();
            }

            System.out.println("Entered array : ");
            for(int i=0;i<n;i++){
                System.out.print(arr[i] + " ");
            }

            int largest=arr[0];
            for(int i=0;i<n;i++){
                if(arr[i]>largest){
                    largest=arr[i];
                }
            }
            int secondlargest=-1;
            for(int i=0;i<n;i++){
                if(arr[i]>secondlargest && arr[i]!=largest ){
                    secondlargest=arr[i];
                }
            }
            //gives the first-largest
            System.out.println("\nlargest no        :  " + largest);
            //gives the second-largest
            System.out.println("Second largest no :  " + secondlargest);
        }
    }
}
