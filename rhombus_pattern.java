package Java;
import java.util.*;

public class rhombus_pattern{

    public static void hollow_rectangle(int TotRows, int TotCols) {
       
        for (int i = 1; i <= TotRows; i++) {
          
            for (int j = 1; j <= TotCols; j++) {
             
                if (i == 1 || i == TotRows || j == 1 || j == TotCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

    }


    public static void solid_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
       
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
           
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void hollow_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
          
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size/dimension of rhombus: ");
        int n = sc.nextInt();
        System.out.println();
        sc.close();
   
        solid_rhombus(n);
        hollow_rhombus(n);

    }

}
