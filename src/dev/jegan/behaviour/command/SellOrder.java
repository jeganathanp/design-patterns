package dev.jegan.behaviour.command;

public class SellOrder implements Order{
    private StockTrade stockTrade;
    public SellOrder(StockTrade stockTrade){
        this.stockTrade = stockTrade;
    }


    @Override
    public void execute() {
        stockTrade.sell();
    }
}
