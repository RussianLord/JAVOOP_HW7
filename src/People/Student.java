package People;

public class Student extends Human{
    private int courseNumber;
    private int numberGroup;

    public Student(int age, String firstName, String lastName, int courseNumber, int numberGroup) {
        super(age, firstName, lastName);
        this.courseNumber = courseNumber;
        this.numberGroup = numberGroup;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(int numberGroup) {
        this.numberGroup = numberGroup;
    }

    @Override
    public String toString() {
        return super.toString() + "<Студент>" +
                ". Номер курса: " + courseNumber +
                ". Номер группы: " + numberGroup+". ";
    }
}
