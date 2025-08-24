package Cours;

public class Teacher {
    String name;
    String mon;
    String branch;

    Teacher( String name, String mon, String branch){
        this.name = name;
        this.mon = mon;
        this.branch = branch;
    }

    void  print (){
        System.out.println("ad : " + this.name);
        System.out.println("tel: " +  this.mon );
        System.out.println("ixtisas: " + this.branch);
    }
}


