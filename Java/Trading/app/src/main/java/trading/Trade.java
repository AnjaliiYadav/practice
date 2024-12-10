package trading;

import java.util.Objects;

public class Trade {

    int gems;
    int amount;
    Goods goods;


    public Trade(int gems, int amount, Goods goods) {
        this.gems = gems;
        this.amount = amount;
        this.goods = goods;
    }


    public int getGems() {
        return gems;
    }


    public int getAmount() {
        return amount;
    }


    public Goods getGoods() {
        return goods;
    }


    @Override
    public String toString() {
        return gems+" gem for "+amount + " " +goods.toString();
    }


    @Override
    public int hashCode() {
        return Objects.hash(gems);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Trade other = (Trade) obj;
        if (gems != other.gems)
            return false;
        if (amount != other.amount)
            return false;
        if (goods != other.goods)
            return false;
        return true;
    }


    public void execute(Trader trader, Citizen citizen) {
        if (trader.trade.equals(this)){
            throw new IllegalArgmentException("Trade is empty");
        }
        else{
           boolean response= citizen.executeTrade(trader.trade);
           if(response){
            trader.addRandomTrade();
           }
        }
    }

    
    
    

}
