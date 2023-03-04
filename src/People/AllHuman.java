package People;

import java.util.ArrayList;
import java.util.List;

public class AllHuman <T>{
    List<T> fullList = new ArrayList<T>();

    public List<Human> addFullList(List<T> takeList) {
        for (T it: takeList) {
            fullList.add(it);
        }
        return (List<Human>) fullList;
    }
    public void getFullList(){
        for (T it: fullList) {
            System.out.println(it);
        }
    }
}
