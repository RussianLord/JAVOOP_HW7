import People.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human dir = new GeneralHuman(30,"Петух","Ебаный","Директор залупы",1000000,12,2);
        Human teach = new Teacher(48,"Лошпед","Ебаный","Преподаватель",15000,"Матан");
        Human stud1 = new Student(18,"Пидор","Гнойный",3,115);
        Human stud2 = new Student(18,"Пездюк","Грязный",4,111);
        Human mag1 = new Master(22,"Сука","Дырявая",6,113);

        AllStuff listPersonal = new AllStuff();
        AllStudents listStudents = new AllStudents();

        listPersonal.addPersonal((UniStuff) dir);
        listPersonal.addPersonal((UniStuff) teach);
//        listPersonal.getFullList();

        listStudents.addStudent((Student) stud1);
        listStudents.addStudent((Student) stud2);
        listStudents.addStudent((Student) mag1);



        AllHuman listHuman = new AllHuman();
        listHuman.addFullList(listPersonal.getPersonalList());
        listHuman.addFullList(listStudents.getStudentList());
        listHuman.getFullList();

    }
}