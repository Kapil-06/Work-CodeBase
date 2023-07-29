public class Pattern34 {
    public static void main(String[] args) {
        int x = 0;
        for (int i = 1; i <= 5; i++) {
            x = x + i;
            for (int j = x; j > x - i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
