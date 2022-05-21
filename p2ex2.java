import java.util.Scanner;

/*
3.	գրել ծրագիր որում կմուտքագրվի 4 թիվ , գտնել և console-ում  տպել  այդ թվերից մեծագույնը:
 */
public class p2ex2 {
    public static void main(String[] args) {
        try {
            System.out.println(maxNumber());
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
    private static double maxNumber(){
        final Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextDouble()){
            final double number1 = scanner.nextDouble();
            final double number2 = scanner.nextDouble();
            final double number3 = scanner.nextDouble();
            final double number4 = scanner.nextDouble();
            return Math.max(Math.max(number1, number2), Math.max(number3, number4));
        }
        throw new RuntimeException();
    }
}
