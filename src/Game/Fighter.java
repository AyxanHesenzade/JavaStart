package Game;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;

    Fighter ( String name, int damage, int health, int weight){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
    }

    void printFighter (){
        System.out.println("oyuncunun adi: "  + this.name );
        System.out.println( " oyuncunun gucu: " + this.damage);
    }


}
