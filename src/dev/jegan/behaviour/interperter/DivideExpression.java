package dev.jegan.behaviour.interperter;

public class DivideExpression implements RpnExpression {
    private RpnExpression lhr;
    private RpnExpression rhr;

    public DivideExpression(RpnExpression lhr, RpnExpression rhr) {
        this.lhr = lhr;
        this.rhr = rhr;
    }

    @Override
    public int execute() {
        return lhr.execute() / rhr.execute();
    }
}
