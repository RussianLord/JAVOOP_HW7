package People;

public class Teacher extends Personal{
    public String lesson;

    public Teacher(int age, int salary, String firstName, String lastName, String position, String lesson) {
        super(age, salary, firstName, lastName, position);
        this.lesson = lesson;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Ведение предмета: " + lesson;
    }
}
