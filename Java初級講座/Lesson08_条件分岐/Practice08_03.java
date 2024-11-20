import java.util.Random;

class Practice08_03 {
    public static void main(String[] args) {
        Random rand1 = new Random();
        Random rand2 = new Random();
        int age = rand1.nextInt(21);
        int gender = rand2.nextInt(2);

        if (age <= 3) {
            if (gender == 0) {
                System.out.println("あなたはbabyな男です");
            } else {
                System.out.println("あなたはbabyな女です");
            }
        } else if (age < 6) {
            if (gender == 0) {
                System.out.println("あなたはchildな男です");
            } else {
                System.out.println("あなたはchildな女です");
            }
        } else if (age < 18) {
            if (gender == 0) {
                System.out.println("あなたはkidな男です");
            } else {
                System.out.println("あなたはkidな女です");
            }
        } else {
            if (gender == 0) {
                System.out.println("あなたはadultな男です");
            } else {
                System.out.println("あなたはadultな女です");
            }
        }

    }

}
