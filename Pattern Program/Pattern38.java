public class Pattern38 {
    public static void main(String[] args) {

        int x = 1;
        int y;
        int z;
        for (int i = 5; i >= 1; i--) {
            y = i;
            z = x;
            for (int j = 5; j >= i; j--) {
                System.out.print(z + " ");
                z = z - y;
                y++;
            }
            x = x + i;
            System.out.println();
        }
    }
}
