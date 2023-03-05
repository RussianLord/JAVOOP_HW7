package Classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Programm {
    private Map<Integer, String> programmList = new HashMap<>();
    private int count;
    private Cabinet num = new Cabinet();
    private Lesson less = new Lesson();
    private String value;
    private Random random = new Random();

    public void addProgramm() {
        count++;
        value = "Номер кабинета: " + num.getCabinetNum() + ". Название предмета: " + less.getLesson() + ".";
        programmList.put(count, value);
    }

    public void getFullProgramm() {
        for (Map.Entry<Integer, String> it : programmList.entrySet()) {
            System.out.println("Номер программы: " + it);
        }
    }
    public String getOneProgramm(){
        return programmList.get(random.nextInt(programmList.size()));
    }
}
