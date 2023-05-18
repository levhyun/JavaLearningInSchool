package kr.hs.dgsw.java.Practice.MyWrite;

import java.util.Arrays;
import java.util.Random;

public class SortProgram {
    private final int MAX_SIZE;
    private final int MAX_RANDOM_NUMBER = 10000;
    private final SelectionSort selectionSort;
    private int[] Array;
    private long SortTime;

    public SortProgram(int MaxSize){
        this.MAX_SIZE = MaxSize;
        this.selectionSort = new SelectionSort();
    }

    public int[] makeArray() {
        this.Array = new int[this.MAX_SIZE];
        Random random = new Random();
        for (int i = 0; i < this.Array.length; i++) {
            this.Array[i] = random.nextInt(this.MAX_RANDOM_NUMBER);
        }
        return this.Array;
    }

    public int[] ArraySorting() {
        long StartTime = System.currentTimeMillis();
        int[] SortedArray = selectionSort.getSortedArray(this.Array);
        long EndTime = System.currentTimeMillis();
        this.SortTime = EndTime - StartTime;
        return SortedArray;
    }

    public long getSortTime() {
        return this.SortTime;
    }

    public static void main(String[] args) {
        SortProgram sort = new SortProgram(10000);
        String BeforeArray = Arrays.toString(sort.makeArray());
        String AfterArray = Arrays.toString(sort.ArraySorting());
        long SortTime = sort.getSortTime();
        System.out.println("정렬전 : " + BeforeArray);
        System.out.println("정렬후 : " + AfterArray);
        System.out.println("정렬 시간 : " + SortTime + "sec");
    }
}
