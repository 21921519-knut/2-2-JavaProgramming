public class MainParms
{
    public static void main(String[] args)
    {
        int i = Integer.parseInt(args[1]);
        System.out.println(i);
        double d = Double.parseDouble(args[2]);
        System.out.println(d);
        for (String name : args)
        {
            System.out.println(name);
        }
    }
}