public class CircleDemo1
{
    public static void main(String[] args)
    {
        Circle1 myCircle = new Circle1(10.0);
        //Circle yourCircle = new Circle();
    }
}

class Circle1
{
    private double radius;

    public Circle1(double r)
    {
        radius = r;
        System.out.println("radius : " + r);
    }
}