import java.util.Scanner;

public class Pattern3 
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int sp = 3;
        int st = 1;

        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < sp ; j++)
            {
                System.out.print(" ");
            }

            for(int j = 0 ; j < st ; j++)
            {
                System.out.print(st + " ");
            }
            System.out.println();

            st++;
            sp--;
        }
    }
}
