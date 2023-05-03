package kr.hs.dgsw.java.Inherit;

import java.util.Date;

import static java.lang.Thread.sleep;

public class Score {
    protected final int point;

    public Score(int point) {
        this.point = point;
    }

    public String getGrade() {
        if (this.point >= 90) {
            return "수";
        } else if (this.point >= 80) {
            return "우";
        } else if (this.point >= 70) {
            return  "미";
        } else if (this.point >= 60) {
            return "양";
        }
        return "가";
    }

    @Override
    public String toString() {
        return String.format("점수는 %d점이고, 등급은 '%s'입니다.", this.point, getGrade());
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
//        try {
//            Score score = (Score) object;
//            return getGrade() == ((Score)object).getGrade();
//        } catch (ClassCastException err) {
//            return false;
//        }
        if (!(object instanceof  Score)) {
            return false;
        }
//        return getGrade().equals(((Score)object).getGrade());
        return getGrade() == ((Score)object).getGrade();
    }

    public static void main(String[] args) {
        Object object = new Object();
        Score score = new Score(82);
        Date date = new Date();

        System.out.println(object.toString());
        System.out.println(score.toString());
        System.out.println(date.toString());

        String str1 = new String("대한민국");
        String str2 = new String("Republic Of korea");
        boolean same = str1.equals(str2);

        Score score1 = new Score(93);
        Score score2 = new Score(93);
        System.out.println(score1.equals(score2));
        System.out.println(score1.equals(score1));
    }
}
