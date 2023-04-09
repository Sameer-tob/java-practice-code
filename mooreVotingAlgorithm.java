import java.util.Scanner;

public class mooreVotingAlgorithm {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            //Size of Array
            System.out.println("Enter Size of Array");
            int n=scn.nextInt();

            //Add Element to the Array
            System.out.println("Add Element to the Array");
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
               arr[i]=scn.nextInt();
            }

            //Display the Entered Array
            System.out.println("Entered Array");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+ " ");
            }

            //invoke findMajority function to compute the majority Element
            findMajority(arr,n);

            //Return the Element that Appear greater than n/2 times
            System.out.println("\nThe majority element that appear more that >n/2 times is : " + findMajority(arr,n));
        }
    }

    public static int findMajority(int arr[],int n){     

        //Initialize initial count with value 0
        int count=0;

        //let the maximum element that appear will be 0
        int element=0;
        for(int i=0;i<n;i++){

    /*
         Initially the count wiil be 0, So let assume that the first Element is the Majority Element ( arr[0] is maxElement)
         and increase the count value to 1, now i value increase(i++ ; i=2 now i for loop) and check for the condition,
         whether that element is our assumed maxElement or not if it is then increse the count value ,if not then decrease the count value
         keep on goint till last elent of array        
 
    */
            if(count==0){
                element=arr[i];
                count=1;
            }
            else if(arr[i]==element){
                count++;
            }
            else{
                count--;
            }
        }

        //once we get the confirmed majority element the chech for the no of times it appeard int that array
        int maxFrequency=0;
        for(int i=0;i<n;i++){
            if(arr[i]==element){
                maxFrequency++;
            }
        }
        //if it appear more that n/2 time then that is the majority element
        if(maxFrequency>n/2){
            return element;
        }
        return -1;
    }
}
