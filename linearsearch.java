import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            //length of Array
            System.out.println("Enter the Length of Array");
            int n=scn.nextInt();
            int temp=0;

            //Add element to Array
            int arr[]=new int[n];
            System.out.println("Add Element to Array");
            for(int i=0;i<n;i++){
                arr[i]=scn.nextInt();
            }

            //Element you want to search in Array
            System.out.println("Enter the no you want to Search");
            int item=scn.nextInt();
            
            //searching Algorithm
            for(int i=0;i<n;i++){
                if(arr[i]==item){
                    System.out.println("Element found at " + i + "th index" );
                    temp++;   // this line execute only when element isn't present
                }
            
            //If element is not present    
            }
            if(temp==0){
                System.out.println("Element Not Found");
            }
        }
        
    }
}
