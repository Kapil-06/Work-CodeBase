public class Pattern33 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            int x = i - 1;
            for (int j = 0; j < i; j++) {
                System.out.print(x + i + " ");
                x += 2;
            }
            System.out.println();
        }
    }
}
