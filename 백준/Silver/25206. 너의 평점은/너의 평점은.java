import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sumScore = 0;
        int scoreCnt = 0;

        while (sc.hasNext()) {
            // 과목, 학점, 등급
            String subject = sc.next();
            double score = sc.nextDouble();
            String grade = sc.next();

            // 만약 등급이 A+면 4.5
            if (grade.contains("A+")) {
                scoreCnt += score;
                score *= 4.5;
            } else if (grade.contains("A0")) {
                scoreCnt += score;
                score *= 4.0;
            } else if (grade.contains("B+")) {
                scoreCnt += score;
                score *= 3.5;
            } else if (grade.contains("B0")) {
                scoreCnt += score;
                score *= 3.0;
            } else if (grade.contains("C+")) {
                scoreCnt += score;
                score *= 2.5;
            } else if (grade.contains("C0")) {
                scoreCnt += score;
                score *= 2.0;
            } else if (grade.contains("D+")) {
                scoreCnt += score;
                score *= 1.5;
            } else if (grade.contains("D0")) {
                scoreCnt += score;
                score *= 1.0;
            } else if (grade.contains("F")) {
                scoreCnt += score;
                score = 0.0;
            } else if (grade.contains("P")) {
                score = 0.0;
            }

            // 총 학점 계산
            sumScore += score;

        }

        if (sumScore==0) {
            System.out.println(0.0000);
        } else {
            System.out.println(String.format("%.6f", (sumScore / scoreCnt)));
        }
    }
}