package dev.jegan.behaviour.interperter;

import java.util.ArrayDeque;
import java.util.Deque;

public class Praser {

    public static void main(String[] args) {
        String expression = "9 5 4 + /";
        Deque<Integer> stack = new ArrayDeque<Integer>();

        for(String val : expression.split(" ")){
            if(val.equals("+")){
                RpnExpression  expression1 = new NumberExpression(stack.pop());
                RpnExpression  expression2 = new NumberExpression(stack.pop());
                stack.push(new AddExpression(expression1, expression2).execute());
            }
            else if(val.equals("-")){
                RpnExpression  expression1 = new NumberExpression(stack.pop());
                RpnExpression  expression2 = new NumberExpression(stack.pop());
                stack.push(new RemoveExpression(expression1, expression2).execute());
            }
            else if(val.equals("*")){
                RpnExpression  expression1 = new NumberExpression(stack.pop());
                RpnExpression  expression2 = new NumberExpression(stack.pop());
                stack.push(new MultiplyExpression(expression1, expression2).execute());
            }
            else if(val.equals("/")){
                RpnExpression  expression1 = new NumberExpression(stack.pop());
                RpnExpression  expression2 = new NumberExpression(stack.pop());
                stack.push(new DivideExpression(expression1, expression2).execute());
            }
            else {
                stack.push(Integer.parseInt(val));
            }

        }

        System.out.println(stack.peek());

    }
}
