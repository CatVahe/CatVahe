import java.lang.management.GarbageCollectorMXBean;
import java.util.Scanner;
/*
4.	Console-ում տպի մուտքագրված թվի կոտորակային մասը
1.	օրինակ՝ եթե մուտքագրվի 45.8, ապա console-ում անհրաժեշտ է գրել 0.8։

 */
public class ex4 {
    public static void main(String[] args) {
        try {
            System.out.println(getFractional());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        }

    private static double getFractional(){
        final Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextDouble()){
            final double number = scanner.nextDouble();
            return number - Math.floor(number);
        }
        throw new RuntimeException();
    }
}
