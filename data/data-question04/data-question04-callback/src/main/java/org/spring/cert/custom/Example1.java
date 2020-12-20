package org.spring.cert.custom;

import org.spring.cert.custom.evaluator.NumbersEvaluator;
import org.spring.cert.custom.expression.AddExpressionEvaluator;
import org.spring.cert.custom.expression.ExpressionEvaluator;
import org.spring.cert.custom.printer.StandardValuePrinter;
import org.spring.cert.custom.printer.ValuePrinter;

public class Example1 {
    public static void main(String[] args) {
        new Example1().run();
    }

    private void run() {
        /**
        * 4 different ways of having callbacks:
        * */

        //1
//        ExpressionEvaluator expressionEvaluator = new AddExpressionEvaluator();

        //2
        ExpressionEvaluator expressionEvaluator = new ExpressionEvaluator() {
            @Override
            public int evaluate(int a, int b) {
                return a * b;
            }
        };

        //3
        //ExpressionEvaluator expressionEvaluator = new MinusExpressionEvaluator();
        //ExpressionEvaluator expressionEvaluator = (a, b) -> a + b;
        //ExpressionEvaluator expressionEvaluator = (a, b) -> a - b;
        //ExpressionEvaluator expressionEvaluator = this::powEvaluator;
        //ExpressionEvaluator expressionEvaluator = Integer::sum;

        ValuePrinter valuePrinter = new StandardValuePrinter();
        //ValuePrinter valuePrinter = new DecoratedValuePrinter();

        NumbersEvaluator numbersEvaluator = new NumbersEvaluator();

        numbersEvaluator.evaluate(4, expressionEvaluator, valuePrinter);
    }

    private int powEvaluator(int a, int b) {
        return (int) Math.pow(a, b);
    }
}
