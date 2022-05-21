public class ex3add6 {
    public static void main(String[] args) {
        quote();
    }
    private static void quote(){
        for (int i = 0; i < 7; i++) {
            if(i < 4) {
                for (int j = 0; j < 4; j++) {
                    if (j < i) {
                        System.out.print(" ");
                    }
                }
            }
            else
                for (int j = 7-i; j > 0; j--) {

                        System.out.print(" ");
            }
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
