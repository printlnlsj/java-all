package sjlee.javaStart.loop.ex;

public class ForEx2 {

    public static void main(String[] args) {
        // 내 풀이
        int num = 2;

        for (int count = 1; count <= 10; count++) {
            System.out.println(num);
            num += 2;
        }

        // 강의 풀이
//        for (int num = 2, count = 1; count <= 10; num += 2, count++) {
//            System.out.println(num);
//        }
    }
}
