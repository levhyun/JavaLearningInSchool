package kr.hs.dgsw.java.Inherit.polygon;

public class Circle extends Polygon {
    protected double radius;
    protected double pi = Math.PI;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double getSize() {
        return radius * radius * pi;
    }

    public static void main(String[] args) {
        Circle circle = new Circle("원", 5);
        double size = circle.getSize();
        System.out.println(size);
    }
}
