package kr.hs.dgsw.java.string;

public class StringSubstring {
    static void showSubstring(String str, int from, int to) {
        System.out.println("str : " + str + "\nfrom : " + from + "\nto : " + to + "\nSubstring() : " + str.substring(from, to) + "\n");
    }

    public static void main(String[] args) {
        String str = "나보기가 역겨워 가실 때에는, 말없이 고이 보내 드리오리디.";
        showSubstring(str, 0, 6);
        showSubstring(str, 10, 14);
        showSubstring(str, str.length()/2, str.length());
    }
}
