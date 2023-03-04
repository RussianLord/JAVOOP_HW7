package People;

public abstract class Personal{
    private int age;
    private int salary;
    private String firstName;
    private String lastName;
    private String position;
    private final int id;
    private TakeID count = new TakeID();

    public Personal(int age, int salary, String firstName, String lastName, String position) {
        this.id = count.get();
        this.age = age;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;

    }

    @Override
    public String toString() {
        return "ID: " + id +
                ". Имя: " + firstName +
                ". Фамилия: " + lastName +
                ". Должность: " + position +
                ". Возраст: " + age +
                ". Зарплата: " + salary+"руб. ";
    }

}
