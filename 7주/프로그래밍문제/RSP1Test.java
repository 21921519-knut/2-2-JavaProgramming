import java.util.Scanner;

public class RSP1Test
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in, "EUC_KR");
        System.out.print("철수 : ");
        String c = in.next();
        System.out.print("영희 : ");
        String y = in.next();

        if (c.equals(y))
        {
            System.out.println("무승부!");
        }
        else if (c.equals("바위"))
        {
            if (y.equals("보"))
            {
                System.out.println("영희, 승");
            }
            else
            {
                System.out.println("철수, 승");
            }
        }
        else if (c.equals("보"))
        {
            if (y.equals("가위"))
            {
                System.out.println("영희, 승");
            }
            else
            {
                System.out.println("철수, 승");
            }
        }
        else if (c.equals("가위"))
        {
            if (y.equals("바위"))
            {
                System.out.println("영희, 승");
            }
            else
            {
                System.out.println("철수, 승");
            }
        }
    }
}