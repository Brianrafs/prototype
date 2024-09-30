public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.x = 10;
        rect.y = 20;
        rect.width = 30;
        rect.height = 40;
        rect.color = "Red";

        Circle circle = new Circle();
        circle.x = 15;
        circle.y = 25;
        circle.radius = 50;
        circle.color = "Blue";

        Triangle triangle = new Triangle();
        triangle.x = 5;
        triangle.y = 10;
        triangle.base = 15;
        triangle.height = 25;
        triangle.color = "Green";

        Rectangle clonedRect = (Rectangle) rect.clone();
        Circle clonedCircle = (Circle) circle.clone();
        Triangle clonedTriangle = (Triangle) triangle.clone();

        System.out.println("Original Rectangle: " + rect);
        System.out.println("Cloned Rectangle: " + clonedRect);

        System.out.println("Original Circle: " + circle);
        System.out.println("Cloned Circle: " + clonedCircle);

        System.out.println("Original Triangle: " + triangle);
        System.out.println("Cloned Triangle: " + clonedTriangle);
    }
}