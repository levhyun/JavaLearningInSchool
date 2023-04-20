package kr.hs.dgsw.java.Inherit;

public class Parent {
//    private String value1 = "private";
//    protected String value2 = "protected";
//    public String value3 = "public";

    private int v1;
    protected int v2;
    public int v3;

    public int add() {
        return v1 + v2 + v3;
    }

    public void setValue1(int value) {
        this.v1 = value;
    }

    public void setValue2(int value) {
        this.v2 = value;
    }

    public void setValue3(int value) {
        this.v3 = value;
    }
}
