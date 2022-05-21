import java.util.Scanner;

/*
3.	գրել ծրագիր, որը կստուգի արդյոք մուտք արված թիվը պարզ է, եթե այո տպի ՞թիվը պարզ է՞ հակառակ դեպքում ՞թիվը պարզ չէ՞
օգտագործեք  for ցիկլը:*/
public class p3ex3 {
    public static void main(String[] args) {
        try {
            System.out.println(primeNumber()?"number is prime" : "number is not prime");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    private static boolean primeNumber(){
        final Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            final int number = scanner.nextInt();
            if (number <= 2 )
                return true;

            double testNumber = Math.sqrt(number);
            for (int i = 2; i < testNumber; i++) {
                if(number% i == 0)
                    return false;
            }
            return true;
        }
        else throw new RuntimeException("input problem");
    }

}
