public class Piramid2Test
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 5; i++)
        {
            printStar(i);
            System.out.println();
        }
    }
    static void printStar(int x)
    {
        for (int i = 1; i <= x; i++)
        {
            System.out.print("*");
        }
    }
}