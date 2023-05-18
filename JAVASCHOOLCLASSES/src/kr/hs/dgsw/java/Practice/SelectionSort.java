package kr.hs.dgsw.java.Practice;

public class SelectionSort { // 정렬 클래스
    public int[] sort(int[] unsorted) { // 정렬된 배열 반환 함수
        return this.doSelectionSorting(unsorted); // 정렬된 배열 반환
    }

    private int findMinIndex(int[] array, int compareIndex, int startIndex, int endIndex) {
        for(int i = startIndex; i <= endIndex; i++){
            if(array[compareIndex] > array[i]){
                compareIndex = i;
            }
        }
        return compareIndex;
    }

    private int[] swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
        return array;
    }

    private int[] doSelectionSorting(int[] unsorted) { // 정렬 함수
        // TODO : 선택 정렬을 통해서 unsorted 오름차순으로 정렬해서 반환하세요.
        for(int i = 0; i < unsorted.length; i++){
            int minIndex = findMinIndex(unsorted, i, i+1, unsorted.length-1);
            unsorted = swap(unsorted, i ,minIndex);
        }
        return unsorted; // 정렬된 배열 반환
    }
}
