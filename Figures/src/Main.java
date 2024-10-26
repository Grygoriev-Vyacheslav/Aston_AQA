


public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.setFillColor("red");
        circle.setBorderColor("white");
        circle.printCircle();

        Rectangle rec = new Rectangle(18, 20);
        rec.setFillColor("blue");
        rec.setBorderColor("yellow");
        rec.printRectangle();

        Triangle tr = new Triangle(3, 4, 5);
        tr.setFillColor("dark");
        tr.setBorderColor("pink");
        tr.printTriangle();
    }
}