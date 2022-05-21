import java.util.Scanner;

/*
2.	գրել նախորդ խնդիրը օգտագործելով while
 */
public class p3ex2
{
    public static void main(String[] args) {
        try {
            System.out.println(result());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    private static double result(){
        final Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextDouble()){
            final double money = scanner.nextDouble();
            double monthCount = scanner.nextDouble();
            double finCount = money;
            while (monthCount != 0) {
                finCount += money*0.07;
                monthCount--;
            }
            return finCount;
        }
        else throw new RuntimeException();
    }
}
