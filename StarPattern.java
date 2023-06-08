package Java;

public class StarPattern

{
    public static void main(String[] args) 
    {
        int rows = 10;
        

        for (int i = 1; i <= rows; i++) 
        {
            for (int j = rows; j > i; j--) 
            {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // For Move to the next line
            
            System.out.println();
        }
    }
}
