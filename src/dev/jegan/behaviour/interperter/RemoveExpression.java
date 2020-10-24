package dev.jegan.behaviour.interperter;

public class RemoveExpression implements RpnExpression {
    private RpnExpression lhr;
    private RpnExpression rhr;

    public RemoveExpression(RpnExpression lhr, RpnExpression rhr) {
        this.lhr = lhr;
        this.rhr = rhr;
    }

    @Override
    public int execute() {

        return lhr.execute() - rhr.execute();
    }
}
