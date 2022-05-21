import java.util.Scanner;
/*
3.	Պատուհանում մուտքագրվում է վայրկյանների քանակը ։ Մուտքագրված վայրկյանները ձևափոխել ժամ/րոպե/վայրկյան
տեսքի և տպել ։ Օրինակ՝ 3725 վայրկյանի դեպքում արդյունքը կլինի՝ 1 ժամ, 2 րոպե, 5 վայրկյան։
 */
public class ex3 {
    public static void main(String[] args) {

        try {
            System.out.println(getTimeInfo());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    static private String getTimeInfo(){
        final Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            int input = scanner.nextInt();
            Timer timer = new Timer();
            timer.setHour(input/3600);
            timer.setMinute((input/60)%60);
            timer.setSecond(input%60);
            return timer.toString();
        }
        throw new RuntimeException();
    }
}

class Timer{
    private int hour;
   private int minute;
   private int second;

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return " { hour=" + hour + ", minute=" + minute + ", second=" + second + '}';
    }
}