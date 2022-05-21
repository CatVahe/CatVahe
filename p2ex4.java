import java.util.Scanner;

/*
5.	օգտագործելով switch case՝ գրել ծրագիր, որն առաջարկում է մուտքագրել 2 թիվ,
դրանից հետո ծրագիրն առաջարկում է ընտրել գործողություն +, -, /, *,% և կախված ձեր
մուտքից կտպի այդ երկու թվերի հետ համապատասխան գործողության արդյունքը :
 */
public class p2ex4 {
    public static void main(String[] args) {
        try {
            final Scanner scanner = new Scanner(System.in);
            System.out.println("please enter math symbol and numbers");
            final char symbol = scanner.next().charAt(0);
            System.out.println(mathOperation(symbol));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static int mathOperation (char symbol){
        final Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            final int number1 = scanner.nextInt();
            final int number2 = scanner.nextInt();
            return switch (symbol) {
                case '+' -> number1 + number1;
                case '-' -> number1 - number2;
                case '/' -> number1 / number2;
                case '*' -> number1 * number2;
                case '%' -> number1 % number2;
                default -> throw new RuntimeException("it's not a mathematical sign");
            };
        } else
            throw new RuntimeException("it's not digit");

         }

}
