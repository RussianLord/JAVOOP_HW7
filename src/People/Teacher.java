package People;

public class Teacher extends UniStuff{
    public String lesson;

    public Teacher(int age, String firstName, String lastName, String position, int salary, String lesson) {
        super(age, firstName, lastName, position, salary);
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
