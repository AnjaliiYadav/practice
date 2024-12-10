package trading;

import java.util.HashMap;

public class Citizen {

    int gems;
    HashMap<Goods, Integer> inventory;

    public Citizen(int gems) {
        this.gems = gems;
        this.inventory = new HashMap<>(); 
        initInventory();
    }

    private void initInventory(){
        for (Goods goods : Goods.values()){
            inventory.put(goods, 0);
        }
    }

    public int getGems(){
        return gems;

    }

    public int getAmount (Goods goods){
        return inventory.get(goods);
    }

    public boolean executeTrade (Trade trade){
        if(trade.gems> this.gems)
            return false;
        else{
            gems -= trade.gems;
            inventory.put(trade.goods, inventory.get(trade.goods)+1);
            return true;
        }
    }
    

}
