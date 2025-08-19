import java.util.Scanner;
import java.util.SortedMap;

public class Asal {

    static  boolean isAsal(int a, int b){
        if(a < 1 ){
                return  false;
        };

        if (b*b>a){
            return  true;
        }

        if ( a%b == 0){
            return  false;
        }

         return  isAsal( a , b+1);

    }
    public static void main(String[] args) {
        int a;
        Scanner input =  new Scanner(System.in);
        a = input.nextInt();

        if( (isAsal(a,2))  ){
            System.out.println(a + " asal");
        } else {
            System.out.println(a + " is not asal");
        }


    }
}
