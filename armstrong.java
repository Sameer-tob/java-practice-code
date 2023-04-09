import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter the no ");
            int no=scn.nextInt();
   
            // length of that no
            String str=Integer.toString(no);
            int length=str.length();


            int temp=no;  //store duplicate value of no
            int arm=0;
            while(temp!=0){
                int power=1;
                int rem=temp % 10;
                for(int i=1;i<=length;i++){
                    power=power * rem;
                }
                arm+=power;
                temp/=10;
            }

            if(arm==no){
                System.out.println(arm + " = " + no + " : Armstrong NO");
            }
            else{
                System.out.println(arm + " != " + no + " : Not Amstrong");
            }
        }

    }
}
