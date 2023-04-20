package kr.hs.dgsw.java.Inherit;

public class Child extends Parent {
    private int v4;
    private int v2;

    public static void main(String[] args) {
        Child child = new Child();
//        System.out.println("child.value1 = " + child.value1);
//        System.out.println("child.value2 access controller = " + child.value2); // child.value2 access controller = protected
//        System.out.println("child.value3 access controller = " + child.value3); // child.value3 access controller = public

//        child.v1 = 2;
        child.v2 = 5;
        child.v3 = 7;
        child.v4 = 9;

        child.setValue1(4);
        child.setValue2(15);

//        System.out.println(child.v1);
        System.out.println(child.v2);
        System.out.println(child.v3);
        System.out.println(child.v4);

        System.out.println("합 : " + child.add());
    }
}
