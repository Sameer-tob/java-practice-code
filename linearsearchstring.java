import java.util.Scanner;

public class linearsearchstring {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        //length of the String
        System.out.println("Enter the length of String to be Stored in Array");
        int n=scn.nextInt();
        int temp=0;

        //Add String to the List
        String arr[]=new String[n];
        System.out.println("Add String to the list");
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.next();
        }

        //Element to be Searched in the List
        System.out.println("Enter the String want to search in the List");
        String item=scn.next();

        //Searching Algorithm
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(item)){
                System.out.print("String present at " + i + " positon");
                temp++;
            }    
        }

        //if Element isn't present
        if(temp==0){
            System.out.println("String not found");
        }

    }
}
