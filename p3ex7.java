/*
7.	Տպել առաջին երկնիշ թիվը, որը 17 -ով բազմապատկելիս ստացվում է 300 -ից մեծ թիվ
 */
public class p3ex7 {
    public static void main(String[] args) {
        biger();

    }
    private static void biger(){
        for (int i = 10; i < 99; i++) {
            if(i*17 > 300){
                System.out.println(i);
                break;
            }

        }
    }
}
