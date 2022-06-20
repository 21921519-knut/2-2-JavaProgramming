public class A
{
    String name = "홍길동"; //필드
    A()
    { //생성자
        System.out.println(name+"나이는");
    }

    void apple() //메소드
    {
        System.out.println(name+"은 사과를 좋아해...");
    }
    public static void main(String[] args)
    {
        A a = new A();
        a.name = "백찬우";
        a.apple();
    }
}