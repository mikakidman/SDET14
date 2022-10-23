package GroupProject2;

public interface Shape {
    void calculateArea();
    void calculatePerimiter();
}
class Circle implements Shape{

    @Override
    public void calculateArea() {
        System.out.println("The area of circle equals to (side) × (side) square units");
    }

    @Override
    public void calculatePerimiter() {
        System.out.println("The perimeter of circle equals to the diameter*3.14");
    }
}
class Square implements Shape{

    @Override
    public void calculateArea() {
        System.out.println("The area of a circle is π multiplied by the square of the radius");
    }

    @Override
    public void calculatePerimiter() {
        System.out.println("Perimeter of square = Sum of the lengths of 4 sides");
    }
}