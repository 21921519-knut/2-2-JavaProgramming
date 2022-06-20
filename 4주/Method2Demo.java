public class Method2Demo
{
    void add(int i1, int i2)
    {
        int sum2 = 0;
        for (int i = i1; i <= i2; i++)
        {
            sum2 += i;
        }System.out.println(sum2);
    }
    public static int sum(int i1, int i2)
    {
        int sum = 0;
        for (int i = i1; i <= i2; i++)
        {
            sum += i;
        }

        return sum;
    }
    public static void main(String[] args)
    {
        Method2Demo m2d = new Method2Demo();
        m2d.add(5, 50);

        int test = Method2Demo.sum(5, 50);
        m2d.sum(100, 2000);
        System.out.println("합(1~10) : " + sum(1, 10));
        System.out.println("합(10~100) : " + sum(10, 100));
        System.out.println("합(100~1000) : " + sum(100, 1000));
    }
}