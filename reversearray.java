import java.util.Scanner;

public class reversearray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the no of Element want to add in Array");
        int no=scn.nextInt();
        int arr[]=new int[no];
        
        System.out.println("Add Element to Array");
        for(int i=0;i<no;i++){
            arr[i]=scn.nextInt();            
        }
        
        //inputed array
        System.out.println("Entered Array");
        for(int i=0;i<no;i++){
            System.out.print(arr[i] + " ");
        }

  /*    //  ***Approach 1**
        
        //output in reverse order
        System.out.println("\nReversed Array");
        for(int i=no-1;i>=0;i--){
            System.out.print(a[i] + " ");
        }
  */
        //  ***Approach 2**
        
        System.out.println("\nReversed Array");
        int start=0;
        int end=no-1;

        while(start<=end){
            int temp =arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<no;i++){
            System.out.print(arr[i] + " ");
        }




    }
}
