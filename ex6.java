import java.util.Scanner;
/*
6.	Console-ում գրվում է քառանիշ թիվ:
Օրինակ՝ 4565, enter-ի ժամանակ գումարել տվյալ թվի թվանշանները և արդյունքը տպել:
 */
public class ex6 {
    public static void main(String[] args) {
        try {
            System.out.println(getSumDigit());
        } catch (
                Exception e) {
            e.printStackTrace();
        }
    }

    private static int getSumDigit(){
        final Scanner scanner = new Scanner(System.in);
        int sum = 0;
        if(scanner.hasNextInt()){
            int number = scanner.nextInt();
        while (number != 0){
            sum = sum + number%10;
            number = (number-number%10)/10;
        }
        return sum;
    }
        throw new RuntimeException();
    }
}
