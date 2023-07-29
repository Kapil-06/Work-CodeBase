public class Pattern32 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            int x = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(x + " ");
                x++;
            }
            System.out.println();
        }
    }
}
