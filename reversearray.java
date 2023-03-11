import java.util.Scanner;

public class reversearray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the no of Element want to add in Array");
        int no=scn.nextInt();
        int[] a=new int[100];
        
        System.out.println("Add Element to Array");
        for(int i=1;i<=no;i++){
            a[i]=scn.nextInt();            
        }
        
        //output in reverse order
        System.out.println("Reversed Array");
        for(int i=no;i>=1;i--){
            System.out.print(a[i] + " ");
        }
    }
}
