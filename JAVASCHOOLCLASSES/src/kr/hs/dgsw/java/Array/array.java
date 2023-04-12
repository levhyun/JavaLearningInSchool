package kr.hs.dgsw.java.Array;

public class array {
    public static void main(String[] args) {
        int[] myArray = new int[10];
//        int myArray[] = new int[10];
        myArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < myArray.length; i++) {
            System.out.printf("%d ",myArray[i]);
        }

        String[] stringTypeArray = new String[]{"\n","h","e","l","l","o"};
        for (int i = 0; i < stringTypeArray.length; i++) {
            System.out.printf("%s",stringTypeArray[i]);
        }
    }
}