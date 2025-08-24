package Cours;

public class Student {


    Teacher teacher;
    Cours c1;
    Cours c2;
    Cours c3;
    String name;
    String num;
    String classes;

    double average;
    boolean isPass;


    Student( String name, String num, String classes, Cours c1, Cours c2, Cours c3) {
        this.name = name;
        this.num = num;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void   addNote( int note1, int note2, int note3){

        if( note1 >= 0 && note1 <=100){
            c1.note = note1;
        }

        if( note2 >= 0 && note2 <=100){
            c2.note = note2;
        }

        if( note3 >= 0 && note3 <=100){
            c3.note = note3;
        }
    }

    void printNote(){
        System.out.println(c1.name + " " + c1.note);
        System.out.println( c2.name + " " + c2.note);
        System.out.println(c3.name + " " + c3.note);
    }

    void findAverage(){
        int ort = (c1.note + c2.note + c3.note);
        this.average = ort / 3.0;

        if ( this.average >= 51){
            this.isPass = true;
            System.out.println(this.name + "sinfi gecti " + " ortalamasi : " + this.average);
        } else {
            System.out.println((this.name + " sinifda kaldi " +  " ortalamasi : " + this.average));
        }

    }





}
