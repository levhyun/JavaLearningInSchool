package kr.hs.dgsw.java.Practice.Final;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sort {
    private final Scanner scanner;
    private final int MAX_ARRAY_SIZE;
    private final int RANDOM_MAX_NUMBER;
    private final SelectSorting selectSorting;
    private long sortElapsedTime;
    private long sortStartTime;
    private long sortEndTime;
    private int[] array;
    private final Random random;

    public Sort(int MAX_ARRAY_SIZE, int RANDOM_MAX_NUMBER) {
        this.scanner = new Scanner(System.in);
        this.MAX_ARRAY_SIZE = MAX_ARRAY_SIZE;
        this.RANDOM_MAX_NUMBER = RANDOM_MAX_NUMBER;
        this.selectSorting = new SelectSorting();
        this.random = new Random();
    }

    public void sortTypeListPrint() {
        System.out.println("1. 선택정렬");
        System.out.println("2. Coming Soon...");
    }

    public String inputSortType() {
        sortTypeListPrint();
        System.out.print("정렬 방식을 입력하세요 > ");
        return this.scanner.next();
    }

    public int[] getArray() {
        return this.array;
    }

    public int[] fillUpArray() {
        this.array = new int[MAX_ARRAY_SIZE];
        for (int index = 0; index < this.MAX_ARRAY_SIZE; index++) {
            this.array[index] = this.random.nextInt(this.RANDOM_MAX_NUMBER);
        }
        return getArray();
    }

    public String arrayToString(int[] Array) {
        return Arrays.toString(Array);
    }

    public void sortStart() {
        this.sortStartTime = System.currentTimeMillis();
    }

    public void sortEnd() {
        this.sortEndTime = System.currentTimeMillis();
        this.sortElapsedTime = this.sortEndTime - this.sortStartTime;
    }

    public long getSortElapsedTime() {
        return this.sortElapsedTime;
    }

    public int[] copyArray(int[] array) {
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        return array2;
    }

    public int[] doSorting(String SortType, Boolean inplace) {
        if (SortType.equals("선택정렬")) {
            if (inplace) {
                sortStart();
                selectSorting.sort(getArray());
                sortEnd();
            } else {
                sortStart();
                int[] resultArray = selectSorting.sort(copyArray(getArray()));
                sortEnd();
                return resultArray;
            }
        } else {
            return null;
        }
        return getArray();
    }

    public String makeResultString(int[] BeforeArray, int[] AfterArray, long SortTime) {
        return String.format("정렬 전 -> %s\n정렬 후 -> %s\n* 정렬 경과 시간 : %d(ms)", arrayToString(BeforeArray), arrayToString(AfterArray), SortTime);
    }

    public void close() {
        this.array = null;
        this.sortElapsedTime = 0;
        this.sortStartTime = 0;
        this.sortEndTime = 0;
        this.scanner.close();
    }

    public static void main(String[] args) {
        Sort sort = new Sort(10000, 10000);
        String SortType = sort.inputSortType();
        int[] beforeArray = sort.fillUpArray();
        int[] afterArray = sort.doSorting(SortType, false);
        if (afterArray != null) {
            long sortTime = sort.getSortElapsedTime();
            String result = sort.makeResultString(beforeArray, afterArray, sortTime);
            System.out.println(result);
        } else {
            System.out.println("ERROR");
        }
        sort.close();
    }
}