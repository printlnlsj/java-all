package sjlee.javaStart.cond.ex;

public class MoveRateEx {

    public static void main(String[] args) {
        double rate = 7.1;

        if (rate <= 9) {
            System.out.println("'어바웃타임'을 추천합니다.");
        }
        if (rate <= 8) {
            System.out.println("'토이 스토리'를 추천합니다.");
        }
        if (rate <= 7) {
            System.out.println("'고질라'를 추천합니다.");
        }
    }
}
