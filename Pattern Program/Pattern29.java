public class Pattern29 {
    public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) {
            int x = i;
            for (int j = 5; j >= i; j--) {
                System.out.print(x + " ");
                x++;
            }
            System.out.println();
        }
    }
}
