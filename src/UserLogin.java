import java.util.Scanner;
public class UserLogin {

    static  boolean isP(int number){
        int temp = number;
        int lastNumber;
        int rNumber = 0;

        while (temp!=0){
            lastNumber= temp%10;
            rNumber = (rNumber*10) + lastNumber;
            temp = temp/10;
        }

        if (rNumber == number){
            return  true;
        } else {
            return  false;
        }

    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        System.out.println(isP(a));

    }
}