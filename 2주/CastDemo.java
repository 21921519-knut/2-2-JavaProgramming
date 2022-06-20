public class CastDemo
{
    public static void main(String[] args)
    {
        /*
        int i;
        double d;
        byte b;

        i = 7/4;
        System.out.println(i);
        d = 7/4;
        System.out.println(d);
        d = 7/(double)4;
        System.out.println(d);
        
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        i = 300;
        if (i < Byte.MIN_VALUE || i > Byte.MAX_VALUE)
        {
            System.out.println("byte 타입으로 변환할 수 없습니다.");
        }
        else
        {
            b = (byte)i;
        }
        */
        byte b1 = 1;
        byte b2 = 2;
        byte b3 = (byte)(b1 + b2);
        int i = b1 + b2;
    }
}