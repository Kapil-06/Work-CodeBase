public class Pattern46 {
    public static void main(String[] args) {
        int x = 1;
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(x++ + " ");
            }
            System.out.println();
        }
    }
}
