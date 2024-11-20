import java.util.Random;

public class ComprehensiveBeginner01_02 {
    public static void main(String[] args) {
        Random rand = new Random();
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            int num = rand.nextInt(101) + 1;
            System.out.println(num);
            sum += num;

            if (sum > 100) {
                break;
            }

        }
        System.out.println("合計値：" + sum);

    }

}
