package Lab4.b;

import java.util.ArrayList;

public class Gift{
    private ArrayList <Candy> gift = new ArrayList<Candy>();

    public ArrayList<Candy> getGift() {
        return gift;
    }

    public void setGift(ArrayList<Candy> gift) {
        this.gift = gift;
    }

    public Gift(int count){

    }
    public Gift(ArrayList<Candy> gift) {
        this.gift = gift;
    }
}
