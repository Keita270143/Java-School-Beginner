import java.util.Random;

class Practice08_04 {
    public static void main(String[] args) {
        Random rand = new Random();
        int color = rand.nextInt(5) + 1;

        if (color == 1) {
            System.out.println("今日のラッキーカラーはピンクです");
        } else if (color == 2 || color == 3 || color == 4) {
            System.out.println("今日のラッキーカラーはレッドです");
        } else if (color == 5) {
            System.out.println("今日のラッキーカラーはゴールドです");
        }
    }
}
