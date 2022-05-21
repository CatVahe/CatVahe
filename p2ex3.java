import java.util.Scanner;

/*
4.	համալսարանում գնահատման համար օգտագործվում է գնահատման 100 բալանոց հանակարգը, կամ A, B, C, D համակարգը:
Գրել ծրագիր որում մուտքագրվելով 100 բալանոց համակարգի գնահատականը՝ console-ում տպի տառային գնահատման համակարգը:
 Օրինակ մուտքագրելով 87՝ console-ում տպի A և կողքին գրի գերազանց(A գնահատման համար 86 է և ավելի, B-ն՝ 71 և ավելի,
 C-ն՝ 40 և ավելի, իսկ մնացած արժեքներ դեպքում D):
 */
public class p2ex3 {
    public static void main(String[] args) {
        try {
            final Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextShort()) {
                covertGrades(scanner.nextShort());
            } else {
                throw new RuntimeException("the value is not an assessment");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    private static void covertGrades (short grade){
       if(grade <= 40) System.out.println(grades.unsatisfactory);
       else if (grade <= 71) System.out.println(grades.satisfactory);
       else if (grade <= 86) System.out.println(grades.good);
       else if (grade <=100) System.out.println(grades.excellent);
       else throw new RuntimeException("the value is not an assessment");

    }
}

enum grades {
    excellent{
        @Override
        public String toString() {
            return "A excellent";
        }
    },
    good{
        @Override
        public String toString() {
            return "B good";
        }
    },
    satisfactory{
        @Override
        public String toString() {
            return "C satisfactory";
        }
    },
    unsatisfactory{
        @Override
        public String toString() {
            return "D unsatisfactory";
        }
    }


}
