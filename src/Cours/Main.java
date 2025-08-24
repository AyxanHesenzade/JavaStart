package Cours;

public class Main {
    public static void main(String[] args) {
        Teacher t1 =  new Teacher("Ayxan", "0709111228", "TRH");
        Teacher t2 =  new Teacher("test", "9989", "MSC");
        Teacher t3 = new Teacher("ayko", "12","FZK");


        Cours trh = new Cours("Tarih", "555", "TRH");
        Cours fzk = new Cours("Fizika", "509", "FZK");
        Cours msc = new Cours("Musiqi", "304","MSC");
        trh.addTeacher(t1);
        fzk.addTeacher(t3);
        msc.addTeacher(t2);

        Student ayx = new Student("ayxan", "505", "4", trh, fzk, msc);



        ayx.addNote(90,90,90);
        ayx.printNote();
        ayx.findAverage();


    }
}
