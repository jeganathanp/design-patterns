package dev.jegan.behaviour.command;

public class Client {
    public static void main(String[] args) {
        StockTrade trade = new StockTrade();
        SellOrder order = new SellOrder(trade);
        order.execute();

    }
}
