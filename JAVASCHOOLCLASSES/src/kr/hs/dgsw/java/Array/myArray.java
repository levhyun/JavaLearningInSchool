package kr.hs.dgsw.java.Array;

import java.util.Random;

public class myArray {
    static int[] arr = new int[10];
    static String randomNumberInsert() {
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000); // 0 ~ 999
        }
        return "배열 구성 완료";
    }
    static String  printArrayValues() {
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
            if (i != arr.length-1) {
                res += ", ";
            }
        }
        return res;
    }
    static int[] findMinValue() {
        int min = 2147483647;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                index = i;
            }
        }
        return new int[]{min,index};
    }
    static int sum() {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }
    static float average() {
        return (float)sum() / (float)arr.length;
    }
    public static void main(String[] args) {
        System.out.println("init : " + randomNumberInsert());
        System.out.println("배열 : " + printArrayValues());
        int[] minArr = findMinValue();
        System.out.println("최솟값 - 인덱스번호 : " + minArr[0] + " - " + minArr[1]);
        System.out.println("합계값 : " + sum());
        System.out.println("평균값 : " + average());
    }
}
