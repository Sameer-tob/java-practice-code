import java.util.ArrayList;
import java.util.Scanner;

public class divisor {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            ArrayList<Integer> a=new ArrayList<>();
            System.out.println("Enter the No");
            int no=scn.nextInt();
            
            for(int i=1;i<=no;i++){
                if(no%i==0){
                    a.add(i);
                }
            }

            System.out.println(a);
        }

       /* 
        for(int i=0;i<a.size();i++){
            System.out.print(a.get(i) + " ");
        }
       */ 
    }
}
