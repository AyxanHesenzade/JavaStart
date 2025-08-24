package Game;

public class Main {
    public static void main(String[] args) {

        Fighter samir = new Fighter("Samir", 99, 100, 50);
        Fighter amir =  new Fighter("Amir", 11, 100, 49);

        Match MMA =  new Match(40, 60, samir , amir);

        MMA.Fight();

    }
}
