package kr.hs.dgsw.java.List;

import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("yellow");
        System.out.println(colors.get(0));
        System.out.println(colors.get(1));
        colors.add(2, "blue");
        System.out.println(colors.get(2));
        System.out.println(colors.size());
    }
}
