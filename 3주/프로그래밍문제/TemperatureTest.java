import java.util.Scanner;

public class TemperatureTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("화씨 온도는? ");
        double f = in.nextDouble();
        double c = (5.0 / 9.0) * (f - 32.0);
        System.out.printf("섭씨 온도는 %.1f \n", c);
    }
}