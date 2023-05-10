package kr.hs.dgsw.java.Inherit.polygon;

public class Triangle extends Rectangle {
    public Triangle(String name, double width, double height) {
        super(name, width, height);
    }

    @Override
    public double getSize() {
        return super.getSize() / 2;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle("직삼각형", 3, 4);
        double size = triangle.getSize();
        System.out.println(size);
    }
}
