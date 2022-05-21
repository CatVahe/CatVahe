/*
8.	Տպել 8 -րդ երկնիշ թիվը, որը 17 -ով բազմապատկելիս ստացվում է 300-ից մեծ թիվ
 */
public class p3ex8 {
    public static void main(String[] args) {
     biger();
    }
    private static void biger(){
        int counter = 0;
        for (int i = 10; i < 99; i++) {
                if(i*17 >= 300) {
                    counter++;
                }
                if(counter == 8) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }

