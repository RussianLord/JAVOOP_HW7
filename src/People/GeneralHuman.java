package People;

public class GeneralHuman extends UniStuff{
    public int parkNumber;
    public int privateCabinet;

    public GeneralHuman(int age, String firstName, String lastName, String position, int salary, int parkNumber, int privateCabinet) {
        super(age, firstName, lastName, position, salary);
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
                "№ Личного кабинета: [" + privateCabinet +
                "]. № Парковочного места: [" + parkNumber +"]." ;

    }
}
