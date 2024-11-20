class Practice09_01 {
    public static void main(String[] args) {
        int array[] = { 2, 4, 6, 8, 10, 20 };

        for (int i = 0; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(array[i]);
        }
    }

}
