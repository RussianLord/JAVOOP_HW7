package People;

public abstract class Human {
    private int age;
    private String firstName;
    private String lastName;
    private final int id;
    private TakeID count = new TakeID();

    public Human(int age, String firstName, String lastName) {
        this.id = count.get();
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ". Имя: " + firstName +
                ". Фамилия: " + lastName +
                ". Возраст: " + age +".";
    }

    public int getId() {
        return id;
    }
}
