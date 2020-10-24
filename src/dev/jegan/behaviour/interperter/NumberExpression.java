package dev.jegan.behaviour.interperter;

import java.util.Deque;

public class NumberExpression  implements RpnExpression{
    Integer val;
    public NumberExpression(Integer val){
        this.val = val;

    }
    @Override
    public int execute() {
        return val;
    }
}
