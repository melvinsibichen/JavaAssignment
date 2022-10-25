import java.util.Scanner;
public class Farcel
{
    public static void main (String []args)
    {
        float temp;
        Scanner s = new Scanner (System.in);
        System.out.println("Enter the temperature ");
        temp=s.nextFloat();
        temp=((temp-32)*5)/9;
        System.out.println("celsius temperature is" +temp);
    }
}