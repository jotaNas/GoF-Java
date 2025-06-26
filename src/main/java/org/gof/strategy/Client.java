package org.gof.strategy;

import org.gof.strategy.service.Calculator;
import org.gof.strategy.strategies.AdditionOperation;
import org.gof.strategy.strategies.DivisionOperation;
import org.gof.strategy.strategies.MultiplicationOperation;
import org.gof.strategy.strategies.SubtractionOperation;

public class Client {
    public static void main(String[] args) {
        Calculator calc = new Calculator(10, 2);
        System.out.println(calc.getResult(new AdditionOperation()));
        System.out.println(calc.getResult(new SubtractionOperation()));
        System.out.println(calc.getResult(new MultiplicationOperation()));
        System.out.println(calc.getResult(new DivisionOperation()));
    }
}
