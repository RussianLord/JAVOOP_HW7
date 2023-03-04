package People;

public class GeneralPersonal extends Personal{
    public int parkNumber;
    public int privateCabinet;

    public GeneralPersonal(int age, int salary, String firstName, String lastName, String position, int parkNumber, int privateCabinet) {
        super(age, salary, firstName, lastName, position);
        this.parkNumber = parkNumber;
        this.privateCabinet = privateCabinet;
    }

    public int getParkNumber() {
        return parkNumber;
    }

    public void setParkNumber(int parkNumber) {
        this.parkNumber = parkNumber;
    }

    public int getPrivateCabinet() {
        return privateCabinet;
    }

    public void setPrivateCabinet(int privateCabinet) {
        this.privateCabinet = privateCabinet;
    }

    @Override
    public String toString() {
        return super.toString()+
                "№ Личного кабинета: " + privateCabinet +
                ". № Парковочного места: " + parkNumber ;

    }
}
