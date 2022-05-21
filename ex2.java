import java.util.Scanner;
import java.lang.Math;
/*
2.	Console պատուհանում մուտքագրվում է 2 թիվ և ցուցադրվում է  մուտքագրված թվի
համապատասխան աստիճանը Օրինակ՝ 4,2 թվերի դեպքում արդյունքը կլինի՝  4^2=16
 */
public class ex2 {
    public static void main(String[] args) {
        try {
            System.out.println(getPow());
        } catch (Exception e){
            e.printStackTrace();
                    }
        }

        static private double getPow (){
            final Scanner scanner = new Scanner(System.in);

            if (scanner.hasNextDouble()) {
                final double number = scanner.nextDouble();
                final double power = scanner.nextDouble();
                return Math.pow(number,power);

            } else
                throw  new RuntimeException();

        }
    }
