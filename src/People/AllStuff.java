package People;

import java.util.ArrayList;
import java.util.List;

public class AllStuff{
    List<UniStuff> humanList = new ArrayList<>();
    public void addPersonal(UniStuff human){
        humanList.add(human);
    }

    public List<UniStuff> getPersonalList() {
        return humanList;
    }

    public void getFullList(){
        for (UniStuff it: humanList) {
            System.out.println(it);
        }
    }

}
