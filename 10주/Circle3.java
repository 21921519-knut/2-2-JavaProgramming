class Circle3
{
    double radius;
    String color;

    public Circle3(double radius, String color)
    {
        this.radius = radius;
        this.color = color;
        System.out.println("radius:" + raduis + ", color:" + color);
    }
    public Circle3(double radius)
    {
        this(radius, "파랑");
    }
    public Circle3(String color)
    {
        this(10.0, color);
    }
    public Circle3()
    {
        this(10.0, "빨강");
    }
    public static void main(String[] args)
    {
        Circle3 c1 = new Circle3(10.0, "빨강");
        Circle3 c2 = new Circle3(5.0);
        Circle3 c3 = new Circle3("노랑");
        Circle3 c4 = new Circle3();
    }
}