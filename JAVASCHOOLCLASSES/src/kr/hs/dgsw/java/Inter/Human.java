package kr.hs.dgsw.java.Inter;

public class Human implements Sing {
    protected String song = "깊고 작은 산골짜기 사이로 맑은 물 흐르는 작은 샘터에\n" +
            "예쁜 꽃들 사이에 살짝 숨겨진 이슬 먹고 피어난 네잎 클로버\n" +
            "랄랄라 한잎 랄랄라 두잎 랄랄라 세잎 랄랄라 네잎\n" +
            "행운을 가져다 준다는 수줍은 얼굴의 미소 한줄기의 따스한 햇살 받으며\n" +
            "희망으로 가득한 나의 친구야 빛처럼 밝은 마음으로 너를 닮고 싶어";

    @Override
    public void sing() {
        System.out.println(this.song);
    }

    @Override
    public void makeSound() {
        System.out.println("데헷ㅎ");
    }

    public static void main(String[] args) {
        Sing student = new Human();
        student.makeSound();
        student.sing();
    }
}
