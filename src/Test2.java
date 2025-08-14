import  java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
        double katet1, katet2, hipetonuz, katetCemi;
        Scanner inp = new Scanner(System.in);
        System.out.print("ilk kateti daxil edin: ");
        katet1 = inp.nextDouble();
        System.out.print("ikinci kateti daxil edin: ");
        katet2 = inp.nextDouble();

        katetCemi =  katet1*katet1 + katet2 * katet2;

        hipetonuz = (Double) Math.sqrt(katetCemi);

        System.out.println(hipetonuz);

    }
}
