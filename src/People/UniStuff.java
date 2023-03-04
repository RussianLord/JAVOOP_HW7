package People;

public class UniStuff extends Human {
    private String position;
    private int salary;

    public UniStuff(int age, String firstName, String lastName, String position, int salary) {
        super(age, firstName, lastName);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  super.toString()+"<Сотрудник Университета>" +
                ". Должность: " + position +
                ". Зарплата: " + salary +
                "руб. ";
    }
}
