import java.util.Scanner;
/*
5.	Պատուհանում մուտքագրվում է թիվ, պետք է ցուցադրել այդ թվի արմատը
1.	օրինակ 16 - ի դեպքում 4

 */
public class ex5 {
    public static void main(String[] args) {
        try {
            System.out.println(getSqrt());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    private static double getSqrt (){
        final Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextDouble()){
            final double number = scanner.nextDouble();
            return Math.sqrt(number);
        }
        throw new RuntimeException();
    }
}
