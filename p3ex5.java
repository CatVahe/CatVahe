
/*1.	Անհրաժեշտ է տպել բոլոր երկնիշ թվերը
	Եթե տվյալ թիվը առանց մնացորդի բաժանվում է 4 -ի ապա նրա դիմաց գրել FIZ
	Եթե տվյալ թիվը առանց մնացորդի բաժանվում է 7 -ի ապա նրա դիմաց գրել BAZ
	Եթե թիվը բաժանվում է և 4 -ի և 7 -ի ապա նրա դիմաց գրել FIZBAZ:
*/
public class p3ex5 {
    public static void main(String[] args) {
        fizbaz();
    }

    private static void fizbaz() {
            for (int i = 10; i < 100 ; i++) {
                if(i % 4 == 0 && i % 7 == 0)
                    System.out.println(i + " FIZBAZ");
                else if(i % 4 == 0)
                    System.out.println(i + " FIZ");
                else if(i % 7 == 0)
                    System.out.println(i + " BAZ");
            }
    }
}
