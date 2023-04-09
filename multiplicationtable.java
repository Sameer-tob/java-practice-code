import java.util.Scanner;

public class multiplicationtable {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            
            System.out.println("Enter the no of which you want to print table\n");
            int table=scn.nextInt();

            for(int i=1;i<=10;i++){
                System.out.println(table + "*" + i + "=" + (table*i));
            }
        }
    }
}
