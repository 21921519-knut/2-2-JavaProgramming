import java.util.Scanner;

public class RSP2Test
{
    public static void main(String[] args)
    {
        String c = input("철수");
        String y = input("영희");
        whosWin(c,y);
    }
    static String input(String s)
    {
        Scanner in = new Scanner(System.in, "EUC-KR");
        System.out.print(s + ": ");
        return in.next();
    }
    static void whosWin(String s1, String s2)
    {
        if (s1.equals(s2))
        {
            System.out.println("무승부!");
        }
        else if (s1.equals("바위"))
        {
            if (s2.equals("보"))
            {
                System.out.println("영희, 승");
            }
            else
            {
                System.out.println("철수, 승");
            }
        }
        else if (s1.equals("보"))
        {
            if (s2.equals("가위"))
            {
                System.out.println("영희, 승");
            }
            else
            {
                System.out.println("철수, 승");
            }
        }
        else if (s1.equals("가위"))
        {
            if (s2.equals("바위"))
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