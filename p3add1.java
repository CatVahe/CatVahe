/*
. օգտագործելով for և if ստանալ
 0
 0 1
 0 2 4
 0 3 6 9
 0 4 8 12 16
 0 5 10 15 20 25
 0 6 12 18 24 30 36
 0 7 14 21 28 35 42 49
 0 8 16 24 32 40 48 56 64
 0 9 18 27 36 45 54 63 72 81

 */
public class p3add1 {
    public static void main(String[] args) {
        cone();

    }

    private static void cone() {

        for (int j = 0; j < 1; j++) {
            System.out.println(j);
            for (int i = 0; i < 2; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < 5; i++) {
                if(i % 2 == 0)
                    System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < 10; i++) {
                if(i % 3 == 0)
                    System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < 17; i++) {
                if(i % 4 == 0)
                    System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < 26; i++) {
                if(i % 5 == 0)
                    System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < 37; i++) {
                if(i % 6 == 0)
                    System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < 50; i++) {
                if(i % 7 == 0)
                    System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < 65; i++) {
                if(i % 8 == 0)
                    System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < 82; i++) {
                if(i % 9 == 0)
                    System.out.print(i + " ");
            }
        }
    }
}
