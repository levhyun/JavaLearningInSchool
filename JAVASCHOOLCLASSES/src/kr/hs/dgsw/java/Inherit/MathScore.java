package kr.hs.dgsw.java.Inherit;

public class MathScore extends  Score{
    public MathScore(int point) {
        super(point);
    }

    @Override
    public String getGrade() {;
        if (super.point >= 70) {
            return "수";
        } else if (super.point >= 50) {
            return "우";
        } else if (super.point >= 40) {
            return  "미";
        } else if (super.point >= 30) {
            return "양";
        }
        return "가";
    }

    public static void main(String[] args) {
        Score korean = new Score(82);
        Score math = new MathScore(65);
        
        boolean same = korean.equals(math);

        System.out.println("same = " + same);
    }
}
