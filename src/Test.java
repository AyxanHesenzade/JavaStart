
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int math ;
        Scanner input =  new Scanner(System.in);
        System.out.print("Riyaziyyat balini daxil et: ");
        math= input.nextInt();


        System.out.print("enter your physic point: ");
        int physic = input.nextInt();

        System.out.print("enter your turkish language point: ");
        int tlp = input.nextInt();

        System.out.print("enter your date history: ");
        int history = input.nextInt();

        System.out.print("enter your music point: ");
        int music = input.nextInt();

        int total = (math + physic + tlp + history + music);

        double average  = total/5;


        String result = (average > 60) ? "next class" : "you stay in your curently class";
        System.out.println(  average + " " + result);

    }
}