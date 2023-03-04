import People.AllPersonal;
import People.GeneralPersonal;
import People.Personal;
import People.Teacher;

public class Main {
    public static void main(String[] args) {
        Personal dir = new GeneralPersonal(30,200,"Урод" +
                "","ебаный","Пидарас",22,1);
        Personal teach = new Teacher(23,100,"Мистер","Хатченс",
                "Преподаватель","Матан");
        AllPersonal listPersonal = new AllPersonal();
        listPersonal.addPersonal(dir);
        listPersonal.addPersonal(teach);
        listPersonal.getFullList();
    }
}