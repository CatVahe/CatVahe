import java.util.Scanner;

/*
1.	Յուրաքանչյուր ամսվա համար բանկը ավելացնում է Ձեր ավանդին գումար ավանդի գումարի 7% -ի չափով:
 Գրել ծրագիր, որտեղ օգտագործողը մուտքագրում է ավանդի գումարը և ամսվա քանակը: Եվ բանկը հաշվարկում է
 ավանդի վերջնական գումարը, հաշվի առնելով ուրաքանչյուր ամսվա տոկոսադրույքները: Հաշիվը որոշելու համար օգտագործեք  for ցիկլը:
 */
public class p3ex1 {
    public static void main(String[] args) {
        try{
            System.out.println(result());
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
    private static double result(){
        final Scanner scanner = new Scanner(System.in);

        if(scanner.hasNextDouble()){
            final double money = scanner.nextDouble();
            final double monthCount = scanner.nextDouble();
            double finCount = money;
            for (int i = 0; i < monthCount ; i++) {
                finCount += money*0.07;
            }
            return finCount;
        }
        else throw new RuntimeException();
    }

}
