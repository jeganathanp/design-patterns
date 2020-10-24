package dev.jegan.behaviour.interperter;

public class AddExpression implements RpnExpression {
    private RpnExpression lhr;
    private RpnExpression rhr;

    public AddExpression(RpnExpression lhr, RpnExpression rhr) {
        this.lhr = lhr;
        this.rhr = rhr;
    }

    @Override
    public int execute() {
        return lhr.execute() + rhr.execute();
    }
}
