package kr.hs.dgsw.java.Inherit.polygon;

public abstract class Polygon { // 추상클래스 : abstract(예약어)
    protected final String name;

    public Polygon(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract double getSize(); // 추상 메소드
    // 추상 메소드는 구현부(Body)가 존재하지 않아야 한다.
    // 추상 메소드의 구현부는 해당 클래스를 상속 받는 자식 클래스 안에서 메소드 기능을 구현한다.

    public static void main(String[] args) {
//        Polygon polygon = new Polygon(); // 추상클래스는 객체를 생성할 수 없다.
    }
}
