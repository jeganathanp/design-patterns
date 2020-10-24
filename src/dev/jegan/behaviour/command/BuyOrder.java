package dev.jegan.behaviour.command;

public class BuyOrder implements Order {
    private StockTrade stockTrade;

    public BuyOrder(StockTrade stockTrade) {
        this.stockTrade = stockTrade;
    }


    @Override
    public void execute() {
        stockTrade.buy();
    }
}
