import java.util.Scanner;
/*
1.	Console պատուհանում մուտքագրվում է 2 թիվ  Օրինակ՝ 150 000  և  50 ։
 Երբ կսեղմվի Enter կցուցադրվի 150 000-ի 50 % - ը, այսինքն` 75 000 ։
 */
public class LAg {
    public static void main(String[] args) {
      try {
        double result =  getPercent();
          System.out.println(result);
      }
      catch (Exception e){
          e.printStackTrace();
      }
    }

   static private double getPercent(){
       final Scanner scanner = new Scanner(System.in);
       if(scanner.hasNextDouble()) {
           final double number = scanner.nextDouble();
           final double percent = scanner.nextDouble();
           return (number) * (percent / 100);
       }
       throw new RuntimeException();
   }
}