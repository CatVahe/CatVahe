import java.util.Scanner;

/*
2.	գրել ծրագիր որում կմուտքագրվի թիվ, եթե թիվը մեծ է կամ հավասար 10-ից և փոքր կամ հավասար է
99-ից console-ում տպել` թիվը երկնիշ է, հակառակ դեպքում տպել եթե թիվը փոքր է 10-ից բայց մեծ է 0-ից
 console-ում տպել՝ թիվը միանիշ է, մնացած դեպքերում console-ում տպել Error բառը:
 */
public class p2ex1 {
    public static void main(String[] args) {
        try {
            getCountDigit();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    private static void getCountDigit (){
        final Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
        final int number = scanner.nextInt();
        if (number < 10) {
            System.out.println(Type.singleDigit);
        } else
        if((number > 10 && number < 99 )) System.out.println(Type.twoDigit);
        else throw new RuntimeException("error");
        }
        throw new RuntimeException();
    }
}
enum Type{
  singleDigit,
  twoDigit,
}
