import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the no ");
        int no=scn.nextInt();
        
        int dupno=no;    //store duplicate value of no
        
        long length=0;
        while(dupno!=0){
            dupno=dupno/10;
            length++;    //length of the no
          
        }
        
        int dupno2=no;  //store duplicate value of no
        int arm=0;
        while(dupno2!=0){
            int power=1;
            int rem=dupno2 % 10;
            for(int i=1;i<=length;i++){
                power=power * rem;
            }
            arm=arm+power;
            dupno2=dupno2/10;
        }

        if(arm==no){
            System.out.println(arm + " = " + no + " : Armstrong NO");
        }
        else{
            System.out.println(arm + " != " + no + " : Not Amstrong");
        }

    }
}
