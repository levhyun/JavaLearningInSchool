package kr.hs.dgsw.java.Inherit;

public /* final */ class Person {
    protected final String name;

//    public Person() {
//        this.name = "GUEST";
//    }

    public Person(String name) {
        this.name = name;
    }

    public /* final */ String getName() {
        return this.name;
    }
}
