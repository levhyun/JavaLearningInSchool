package kr.hs.dgsw.java.Class;

public class AccessModifier {
    int value1; // 범위 : 같은 패키지
    private int value2; // 범의 : 같은 클래스
    public int value3; // 범위 : 없음
    protected int value4; // 범위 : 같은 패키지, 상속받은 클래스

    public int getValue2() {
        return this.value2;
    }

    public static void main(String[] args) {
        AccessModifier object = new AccessModifier();
        object.value1 = 4;
        object.value2 = 5;
        object.value3 = 6;
        object.value4 = 7;
    }
}