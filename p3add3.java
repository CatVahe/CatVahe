public class p3add3 {
    public static void main(String[] args) {
        triangleDesc();
    }

    private static void triangleDesc() {
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
