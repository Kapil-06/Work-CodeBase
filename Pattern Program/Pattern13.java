public class Pattern13 {
    public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) {
            int x = i;
            for (int j = 1; j <= 5; j++) {
                System.out.print(x + " ");
                x = x + 5;
            }
            System.out.println();
        }
    }
}
