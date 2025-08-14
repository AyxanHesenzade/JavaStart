import java.util.Scanner;

public class Ucbcaqsahesi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double a, b, c, yariPerimetr, sahe;

        System.out.print("Birinci tərəfi daxil edin: ");
        a = inp.nextDouble();
        System.out.print("İkinci tərəfi daxil edin: ");
        b = inp.nextDouble();
        System.out.print("Üçüncü tərəfi daxil edin: ");
        c = inp.nextDouble();


        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Tərəflər sıfır və ya mənfi ola bilməz!");
            return;
        }
        if (a + b <= c || b + c <= a || a + c <= b) {
            System.out.println("Bu tərəflərlə üçbucaq təşkil oluna bilməz!");
            return;
        }

        yariPerimetr = (a + b + c) / 2;
        sahe = Math.sqrt(yariPerimetr * (yariPerimetr - a) * (yariPerimetr - b) * (yariPerimetr - c));
        System.out.println("Üçbucağın sahəsi: " + sahe);
    }
}