public class ex3add4 {
    public static void main(String[] args) {
        triangleAsc();

    }

    private static void triangleAsc() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
