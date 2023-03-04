package People;

public class TakeID {
    private static int count;
    public int get(){
        count++;
        return count;
    }
}
