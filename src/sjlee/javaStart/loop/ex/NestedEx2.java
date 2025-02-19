package sjlee.javaStart.loop.ex;

public class NestedEx2 {

    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 진짜 피라미드
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < rows - i - 1; j++) {
//                System.out.print(" "); // 공백
//            }
//            for (int x = 0; x < 2 * i + 1; x++) {
//                System.out.print("*"); // 별 출력
//            }
//            System.out.println();
//        }
    }
}
