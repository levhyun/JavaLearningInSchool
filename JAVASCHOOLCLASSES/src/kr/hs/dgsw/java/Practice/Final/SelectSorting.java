package kr.hs.dgsw.java.Practice.Final;

public class SelectSorting {
    private int[] array;
    private int arraySize;

    private void setArray(int[] araay, int araaySize) {
        this.array = araay;
        this.arraySize = araaySize;
    }

    private int getArraySize() {
        return this.arraySize;
    }

    private int[] getArray() {
        return this.array;
    }

    private void swap(int index1, int index2) {
        int temp = this.array[index1];
        this.array[index1] = this.array[index2];
        this.array[index2] = temp;
    }

    private int findMinValue(int compareValue) {
        int startIndex = compareValue + 1;
        int minValueOfIndex = compareValue;
        for (int i = startIndex; i < getArraySize(); i++) {
            if (this.array[minValueOfIndex] > this.array[i]) {
                minValueOfIndex = i;
            }
        }
        return minValueOfIndex;
    }

    private int[] sortingArray() {
        for (int i = 0; i < getArraySize(); i++) {
            swap(i, findMinValue(i));
        }
        return getArray();
    }

    public int[] sort(int[] array) {
        setArray(array, array.length);
        return sortingArray();
    }
}