package kr.hs.dgsw.java.Practice;

import java.util.Arrays;
import java.util.Random;
//import java.util.Scanner;

public class SortingExecutor { // 정렬 프로그램 실행 클래스
    private static final int SAMPLE_DATA_SIZE = 10000; // 데이터 배열 크기
//    private final Scanner scanner;
    private final SelectionSort selectionSort; // 정렬 클래스 변수 선언
    private int[] sampleData; // 데이터 배열 변수 선언
    private long elapsedTime; // 정렬 경과 시간 변수 선언

    public SortingExecutor() { // 정렬 프로그램 실행 클래스 생성자
//        this.scanner = new Scanner(System.in);
        this.selectionSort = new SelectionSort(); // 정렬 클래스 객체 생성
    }

    public void makeSampleData() { // 데이터 배열에 랜덤으로 값을 생성하여 채워넣는 함수
        this.sampleData = new int[SAMPLE_DATA_SIZE]; // 데이터 배열 변수에 SAMPLE_DATA_SIZE(10000)크기의 정수형 배열 객체 생성하여 대입
        Random random = new Random(); // 랜덤 객체 생성
        for (int i = 0; i < this.sampleData.length; i++) { // 0 ~ this.sampleData.length(10000) - 1
            this.sampleData[i] = random.nextInt(10000); // 데이터 배열의 인덱스 번호가 i인 자리에 랜덤 수 대입
        }
    }

    public int[] doSorting() { // 선택 정렬 실행 후 결과 반환 함수
        long start = System.currentTimeMillis(); // 정렬 시작 시간 변수
        int[] sorted = selectionSort.sort(this.sampleData); // 정렬 된 배열 변수 선언
        long end = System.currentTimeMillis(); // 정렬 완료 시간 변수
        this.elapsedTime = end - start; // 정렬 경과 시간 변수에 정렬 경과 시간 대입
        return sorted; // 정렬 된 배열 반환
    }

    public void printElapsedTime() { // 정렬 경과 시간 출력 함수
        System.out.printf("%d개의 자료를 정렬하는데 %d(ms)의 시간이 경과했습니다.\n", this.sampleData.length, this.elapsedTime); // 정렬 경과 시간 출력
    }


//    public void close() {
//        if (this.scanner != null) {
//            this.scanner.close();
//        }
//    }

    public static void main(String[] args) {
        SortingExecutor executor = new SortingExecutor(); // 정렬 프로그램 실행 클래스 객체 생성
        executor.makeSampleData(); // 데이터 배열에 값 생성
        System.out.println("정렬전 : " + Arrays.toString(executor.sampleData)); // 정렬 전 데이터 배열 출력
        int[] sorted = executor.doSorting(); // 선택 정렬 실행 후 결과 반환 함수
        System.out.println("정렬후 : " + Arrays.toString(sorted)); // 정렬 후 데이터 배열 출력
        executor.printElapsedTime(); // 정렬 경과 시간 출력 함수 호출
//        executor.close();
    }
}
