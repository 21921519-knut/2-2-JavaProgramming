import java.util.Scanner;

public class LowerToUpperTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("소문자를 1개 입력하세요 : ");
        String s = in.next();
        char c = s.charAt(0);
        System.out.printf("대문자는 : %c\n", c - ('a' - 'A'));

        System.out.print("소문자를 1개 입력하세요 : ");
        String ss = in.next();
        char cc = ss.charAt(0);
        System.out.printf("대문자는 : %c\n", cc - ('A' - 'a'));
    }
}