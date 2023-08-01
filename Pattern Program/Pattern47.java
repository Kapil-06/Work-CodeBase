public class Pattern47 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(i % 2 + " ");
            }
            System.out.println();
        }
    }
}
