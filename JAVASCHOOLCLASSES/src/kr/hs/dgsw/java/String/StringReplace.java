package kr.hs.dgsw.java.String;

public class StringReplace {
    static void showReplace(String str, String before, String after) {
        System.out.println("str : " + str + "\nbefore : " + before + "\nafter : " + after + "\nReplace() : " + str.replace(before, after) + "\n");
    }

    static void showReplaceFirst(String str, String before, String after) {
        System.out.println("str : " + str + "\nbefore : " + before + "\nafter : " + after + "\nReplaceFirst() : " + str.replaceFirst(before, after) + "\n");
    }

    static void showReplaceAll(String str, String before, String after) {
        System.out.println("str : " + str + "\nbefore : " + before + "\nafter : " + after + "\nReplaceAll() : " + str.replaceAll(before, after) + "\n");
    }

    public static void main(String[] args) {
        String str = "무궁화 삼천리 화려강산 대한사람 대한으로 길이 보전하세";
        showReplace(str, "사람", "동물");
        showReplace(str, "무궁화", "개나리");
        showReplace(str, "삼", "육");

        showReplace(str, "대한", "조선");
        showReplaceFirst(str, "대한", "조선");

        showReplaceAll(str, ".", "[]");
    }
}
