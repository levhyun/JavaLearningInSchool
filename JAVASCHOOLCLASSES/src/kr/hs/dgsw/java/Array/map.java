package kr.hs.dgsw.java.Array;

import java.util.*;
import java.util.stream.IntStream;

import static java.lang.System.out;

public class map {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        String[] names = new String[]{
                "김수인","김예림","최아영","구자현","김종윤","도현욱",
                "모성현","박상현","성의근","우영기","윤석규","이경민",
                "이민규","이석호","조승완","최희건","하건록","한지원"
        };
        IntStream.range(0, names.length).forEach(i-> map.put(2401+i, names[i]));
        map.forEach((number, name) -> out.println(number + name));

        List<String> list = new LinkedList<>();
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            list.add(map.get(key));
        }
        list.forEach(out::println);

        Collection<String> values = map.values();
        out.println(values);
    }
}
