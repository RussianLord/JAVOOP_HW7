package Classes;

import java.util.Random;

public class Cabinet {
    private int minNum = 10;
    private int maxNum = 51;
    Random random = new Random();
    public int getCabinetNum(){
        return random.nextInt(maxNum-minNum)+minNum;
    }
}
