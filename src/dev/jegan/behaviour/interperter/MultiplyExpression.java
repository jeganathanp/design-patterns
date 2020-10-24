package dev.jegan.behaviour.interperter;

public class MultiplyExpression implements RpnExpression {
    private RpnExpression lhr;
    private RpnExpression rhr;

    public MultiplyExpression(RpnExpression lhr, RpnExpression rhr) {
        this.lhr = lhr;
        this.rhr = rhr;
    }

    @Override
    public int execute() {
        return lhr.execute() * rhr.execute();
    }
}
