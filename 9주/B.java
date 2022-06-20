public class B
{
    String name;

    B()
    {
        System.out.println("클래스 B");
        this.m1();
    }

    void m1()
    {
        System.out.println("메소드 m1");
        this.m2();
    }
    void m2()
    {
        System.out.println("메소드 m2");
    }
    public static void main(String[] args)
    {
        new B();
    }
}