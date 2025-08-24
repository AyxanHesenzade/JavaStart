package Game;

import java.lang.management.MonitorInfo;
import java.util.SortedMap;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    int i = 1;

    Match(int minWeight, int maxWeight, Fighter f1, Fighter f2){
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.f1 = f1;
        this.f2 = f2;
    }

    void visibleFighter(){
        System.out.println(this.f1.name);
    }

    public  void Fight(){
        if ( (this.f1.weight >= minWeight) && (this.f1.weight <= maxWeight)  && (this.f2.weight >= minWeight) && (this.f2.weight <= maxWeight) ){
            System.out.println("Fight Strat");

            while ( this.f1.health > 0 && this.f2.health >0  ){


                System.out.println("Raund " + i);
                System.out.println("player " +  this.f1.name + "  cani " + this.f1.health);
                System.out.println("player " +  this.f2.name + "  cani " + this.f2.health);


                 this.f1.health = this.f1.health - this.f2.damage;
                this.f2.health = this.f2.health - this.f1.damage;

                i++;
            }

            if (this.f1.health > 0){
                System.out.println("player " + this.f1.name + " won");
            } else  {
                System.out.println("player " + this.f2.name + " won");
            }
        } else {
            System.out.println("oyuncularin cekisi duz deyil");
        }
    }





}
