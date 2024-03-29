/*
    Java Program to print true if the 2nd number is the mid point of the the first and third number.
    input -> 2 4 6
    output -> true

    input -> 10 15 30
    output -> false
*/
import java.util.Scanner;

public class MiddlePoint 
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        scn.close();

        System.out.println(midPoint(a, b, c));
    }   

    static boolean midPoint(int a, int b, int c)
    {
        if((b - a) == (c - b))
            return true;
        
        return false;
    }
}
