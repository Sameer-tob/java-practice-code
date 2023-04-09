import java.util.Scanner;

public class gcdlcm {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {

            System.out.println("Enter the First no");
            long fn=scn.nextLong();
            System.out.println("Enter the Second no");
            long sn=scn.nextLong();

            long ofn=fn;  //duplicate value
            long osn=sn;  //duplicate value
            
            while(fn>0 && sn>0){
                if(fn>sn)
                fn=fn%sn;
                else
                sn=sn%fn;
            }
            if(fn==0){
                System.out.println("GCD : " + sn);
                System.out.println("LCM : " + (ofn*osn)/sn);
            }
            else{
                System.out.println(fn);
                System.out.println("LCM : " + (ofn*osn)/fn);
            }
        }
    }
}
