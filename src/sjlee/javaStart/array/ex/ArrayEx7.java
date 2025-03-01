package sjlee.javaStart.array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] scores = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"};

        for (int row = 0; row < scores.length; row++) {
            System.out.println((row + 1) + "번 학생의 성적을 입력하세요:");

            for (int col = 0; col < scores[row].length; col++) {
                System.out.print(subjects[col] + " 점수:");
                scores[row][col] = sc.nextInt();
            }
        }

        for (int row = 0; row < scores.length; row++) {
            int sum = 0;

            for (int col = 0; col < scores[row].length; col++) {
                sum += scores[row][col];
            }

            double avg = (double) sum / scores[row].length;
            System.out.print((row + 1) + "번 학생의 총점: " + sum + ", 평균: " + avg);
            System.out.println();
        }
    }
}
