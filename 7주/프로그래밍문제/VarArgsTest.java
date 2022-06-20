public class VarArgsTest
{
    public static void main(String[] args)
    {
        foo("안녕", 1);
        foo("안녕하세요", 1, 2);
        foo("반가워요");
        foo("잘있어요", 1, 2, 3);
        foo("다시만나요", 1, 2, 3, 4, 5, 6, 7);
    }
    static void foo(String str, int ... a)
    {
        System.out.print(str + " ");
        for (int i : a)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
