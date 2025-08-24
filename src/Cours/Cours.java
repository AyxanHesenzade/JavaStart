package Cours;

public class Cours {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    Cours( String name, String code , String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    };
    void addTeacher( Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;

        } else {
            System.out.println("xeta");
        }

    }

    void printTeacher( ){
        this.teacher.print();
    }



    }




