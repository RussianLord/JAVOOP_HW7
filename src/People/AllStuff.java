package People;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AllStuff{
    private List<UniStuff> humanList = new ArrayList<>();
    private Random random = new Random();
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
    public String getOneStuff(){
        return String.valueOf(humanList.get(random.nextInt(humanList.size())));
    }

}
