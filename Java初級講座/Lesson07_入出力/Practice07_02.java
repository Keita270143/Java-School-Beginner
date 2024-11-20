import java.util.Scanner;

class Practice07_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "SHIFT_JIS");

        System.out.print("名前を入力してください　>");
        String inputName = sc.nextLine();

        System.out.println("MLBで二刀流として活躍している日本人野球選手は「" + inputName + "」です");

        sc.close();
    }

}
