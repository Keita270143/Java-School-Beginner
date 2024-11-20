import java.util.Scanner;

class Practice07_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("数字を入力してください　>");
        int inputNum_01 = sc.nextInt();
        int inputNum_02 = (inputNum_01 % 3);

        System.out.println(inputNum_01 + "を3で割った余りは" + inputNum_02 + "です");
    }

}
