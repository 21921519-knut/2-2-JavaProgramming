import java.util.Scanner;

public class LogicalTest
{
    public static void main(String[] args)
    {
        boolean and, or, xor;
        Scanner in = new Scanner(System.in);
        System.out.print("정수입력 : ");
        int x = in.nextInt();
        and = x % 4 == 0 && x % 5 == 0;
        or = x % 4 == 0 || x % 5 == 0;
        xor = x % 4 == 0 ^ x % 5 == 0;

        System.out.println("4와 5로 나누어지는지 : " + and);
        System.out.println("4 또는 5로 나누어지는지 : " + or);
        System.out.println("4나 5 둘중에 하나로만 나누어지는지 : " + xor);
    }
}