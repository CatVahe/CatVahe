import java.util.Scanner;

/*
4.	գրել նախորդ խնդիրը օգտագործելով do while
 */
public class p3ex4 {
    public static void main(String[] args) {
        System.out.println(primeNumber()?"number is prime" : "number is not prime");

    }
    private static boolean primeNumber(){
        final Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            final int number = scanner.nextInt();
            if (number <= 2 )
                return true;
            double testNumber = Math.sqrt(number);
            int i = 2;
            do  {
                if(number % i == 0)
                    return false;
                i++;
            } while (i < testNumber);

            return true;
        }
        else throw new RuntimeException("input problem");
    }
}
