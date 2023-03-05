package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lesson {
    private List<String> lessonsCollection = new ArrayList<>();
    private Random random = new Random();
    public void addLesson(){
        lessonsCollection.add("Высшая математика");
        lessonsCollection.add("Физика");
        lessonsCollection.add("Проектирование");
        lessonsCollection.add("Теоретическая механика");
        lessonsCollection.add("Психология");
        lessonsCollection.add("Программирование");
        lessonsCollection.add("Физическая культура");
    }
    public String getLesson(){
        addLesson();
        return lessonsCollection.get(random.nextInt(lessonsCollection.size()));
    }

}
