import java.util.Scanner;

public class ComprehensiveBeginner01_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("何段>");
        int inputNum = sc.nextInt();

        if (inputNum < 1 || inputNum > 5) {
            System.out.println("1~5までの整数を入力してください");
        } else {

            for (int i = 1; i <= inputNum; i++) {
                for (int j = 1; j <= 5 - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
        sc.close();
    }
}
