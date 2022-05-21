    /*
6.	a,b,c (ոչ իրար հավասար) թվերը կոչվում են Պյութագորասյան եռյակ, եթե c2=a2+b2
1.	Օրինակ՝ 3,4,5 -ի դեպքում 25 = 16 + 9
2.	Ներկառուցված ցիկլերի օգնությամբ տպել մինչև 99 բոլոր Պյութագորասյան եռյակները (խնդրի լուծման համար 3 ներկառուցված
 ցիկլ կիրառել)
*/
public class p3ex6 {
    public static void main(String[] args) {
        triplPY();

    }
    private static void triplPY(){
        for (int i = 1; i < 99; i++) {
            for (int j = 1; j < 99; j++) {
                for (int k = 1; k < 99; k++) {
                    if(k*k == j*j + i*i)
                    System.out.println(k + " " + i + " " + j + " ");

                }
            }
        }
    }
}
