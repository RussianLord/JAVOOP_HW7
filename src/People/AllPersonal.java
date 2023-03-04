package People;

import java.util.ArrayList;
import java.util.List;

public class AllPersonal {
    List<Personal> personalList = new ArrayList<>();
    public void addPersonal(Personal personal){
        personalList.add(personal);
    }

    public List<Personal> getPersonalList() {
        return personalList;
    }

    public void getFullList(){
        for (Personal it: personalList) {
            System.out.println(it);

        }
    }
}
