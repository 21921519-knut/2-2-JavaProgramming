import java.util.Scanner;

public class ScannerDemo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        double d = in.nextDouble();
        System.out.println(x+d);
    }
}