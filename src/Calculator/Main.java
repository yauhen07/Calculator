package Calculator;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Calc calc = new Calc();
        System.out.println("введите первое число");
        calc.setA(calc.input());
        System.out.println("введите второе число");
        calc.setB(calc.input());
        System.out.println("выберите операцию: +, -, * или /");
        calc.calcul();

    }
}
