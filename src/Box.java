public class Box {
    double height;
    double width;
    double length;

    Box(double size)
    {
        this(size, size, size);
    }

    Box(double height, double width, double length)
    {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    Box Increase()
    {
        return new Box(this.length*2, this.width*2, this.height*2);
    }
}
