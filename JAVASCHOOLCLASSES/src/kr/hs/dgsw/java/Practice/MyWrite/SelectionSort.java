package kr.hs.dgsw.java.Practice.MyWrite;

import java.util.Arrays;

public class SelectionSort {
    public int[] getSortedArray(int[] Array) {
        return this.Sorting(Array);
    }

    private int findMinValue(int[] Array, int compareValue) {
        int minIndex = compareValue;
        for (int i = minIndex+1; i < Array.length; i++) {
            if (Array[minIndex] > Array[i]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    private int[] swap(int[] Array, int op1, int op2) {
        int temp = Array[op1];
        Array[op1] = Array[op2];
        Array[op2] = temp;
        return Array;
    }

    private int[] Sorting(int[] Array) {
        for (int i = 0; i < Array.length-1; i++) {
            int MinValue = findMinValue(Array, i);
            Array = swap(Array, i ,MinValue);
        }
        return Array;
    }
}
