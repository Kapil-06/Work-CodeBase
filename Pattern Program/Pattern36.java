public class Pattern36 {
    public static void main(String[] args) {
        int x = 2;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(x + " ");
                x += 2;
            }
            System.out.println();
        }
    }
}
