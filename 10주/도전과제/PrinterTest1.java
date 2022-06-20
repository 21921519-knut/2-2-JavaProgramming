public class PrinterTest1
{
    public static void main(String[] args)
    {
        Printer1 p1 = new Printer1();
        p1.numOfPapers = 100;
        p1.print(70);
        System.out.println(p1numOfPapers);
    }
}

class Printer1
{
    int numOfPapers = 0;

    void print(int amount)
    {
        numOfPapers -= amount;
    }
}