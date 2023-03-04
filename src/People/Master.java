package People;

import java.util.Random;

public class Master extends Student{
    private int moreLessonNumber;
    private String event;
    private Random random = new Random();

    public Master(int age, String firstName, String lastName, int courseNumber, int numberGroup) {
        super(age, firstName, lastName, courseNumber, numberGroup);
        this.moreLessonNumber = getMoreLessonNumber();
        this.event = getEvent();
    }

    @Override
    public String toString() {
        return super.toString()+ "<Магистр>" +
                ". Кол-во доп. занятий: " + getMoreLessonNumber() +
                ". Мероприятие: " + getEvent();
    }

    public int getMoreLessonNumber() {
        int min = 5;
        int max = 11;
        return random.nextInt(max-min)+min;
    }

    public String getEvent() {
        String[] events = new String[]{"ЭкспоЦентр.","Практика на производстве.","Преподавание студентам."};
        return events[random.nextInt(events.length)];
    }
}
