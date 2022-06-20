public class BitOperatorDemo
{
    public static void main(String[] args)
    {
        int i1 = -10;
        int i2 = i1 >> 1;
        int i3 = i1 << 1;
        int i4 = i1 >>> 1;

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        int i5 = -10;
        int i6 = i1 >> 2;
        int i7 = i1 << 2;
        int i8 = i1 >>> 2;

        System.out.println(i5);
        System.out.println(i6);
        System.out.println(i7);
        System.out.println(i8);
    }
}