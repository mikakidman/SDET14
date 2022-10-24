package Class21;
public class Overloading {
        public static void main (String[]args){
            Circle circle = new Circle(6);
            circle.calculateArea();
        }
    }

    class Shape {
        double radius;

        Shape(double radius) {
            this.radius = radius;
        }
    }

    class Circle extends Shape {
        Circle(double radius) {
            super(radius);
        }

        void calculateArea() {
            //System.out.println(3.14*radius*radius);
            System.out.println(Math.PI * Math.pow(radius, 2));
        }
    }



