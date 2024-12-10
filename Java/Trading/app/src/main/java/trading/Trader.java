package trading;


import java.util.Random;

public class Trader {

    Trade trade;

    public Trader() {
        

        trade = addRandomTrade();

    }

    private int generateRandom(int max){
        Random random = new Random();
        return  random.nextInt(max);
    }

    public Trade addRandomTrade(){
        Goods[] allGoods = Goods.values();
        int randomGoodsIndex = generateRandom(allGoods.length);
        int gems = generateRandom(6);
        int amount = generateRandom(6); 

        return new Trade(gems, amount, allGoods[randomGoodsIndex]);
    }
    

}
