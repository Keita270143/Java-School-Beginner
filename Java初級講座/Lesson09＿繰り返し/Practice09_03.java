import java.util.Random;

class Practice09_03 {
    public static void main(String[] args) {

        for (int x = 1; x <= 10; x++) {
            Random rand = new Random();
            int num = rand.nextInt(6) + 1;

            if (num == 1 || num == 3 || num == 5) {
                System.out.println(x + "回目、" + num + "が出ました");
            }
        }
    }
}
