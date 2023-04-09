import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            
            System.out.println("Enter the no");
            int no=scn.nextInt();

            int count=0;
            for(int i=1;i<=no;i++){
                if(no%i==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println( no + " : Prime no");
            }
            else{
                System.out.println(no + " : Non-Prime ");
            }
        }
    }
}
