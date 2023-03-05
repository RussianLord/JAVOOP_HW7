import Classes.Programm;
import People.*;

public class Main {
    public static void main(String[] args) {
        Human dir = new GeneralStuff(30,"Антон","Петров","Директор университета",1000000,12,2);
        Human teach = new Teacher(48,"Иван","Иванов","Преподаватель",15000,"Физика");
        Human stud1 = new Student(18,"Артур","Пирожков",3,115);
        Human stud2 = new Student(18,"Анастасия","Курвова",4,111);
        Human mag1 = new Master(22,"Алексей","Мямликов",6,113);

        Programm test = new Programm();
        test.addProgramm();
        test.addProgramm();
        test.addProgramm();
        test.getFullProgramm();

        AllStuff listPersonal = new AllStuff();
        AllStudents listStudents = new AllStudents();

        listPersonal.addPersonal((UniStuff) dir);
        listPersonal.addPersonal((UniStuff) teach);
        listPersonal.getFullList();

        listStudents.addStudent((Student) stud1);
        listStudents.addStudent((Student) stud2);
        listStudents.addStudent((Student) mag1);
        listStudents.getFullList();


//        AllHuman listHuman = new AllHuman();
//        listHuman.addFullList(listPersonal.getPersonalList());
//        listHuman.addFullList(listStudents.getStudentList());
//        listHuman.getFullList();

    }
}