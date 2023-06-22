package kr.hs.dgsw.java.Geneeric;

public class Sample<T1, T2> {
    private T1 value;

    private T2 data;

    public T1 getValue() {
        return value;
    }

    public void setValue(T1 value) {
        this.value = value;
    }

    public T2 getData() {
        return data;
    }

    public void setData(T2 data) {
        this.data = data;
    }

    public static void main(String[] args) {
        Sample<String, String> sample = new Sample<String, String>();
        sample.setValue("korea");
        sample.setData("한국");
        System.out.println(sample.getValue() + " " + sample.getData());

        Sample<Integer, String> sample2 = new Sample<Integer, String>();
        sample2.setValue(3);
        sample2.setData("삼");
        System.out.println(sample2.getValue() + " " + sample2.getData());
    }
}
