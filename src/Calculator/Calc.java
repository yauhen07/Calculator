package Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calc {
    private int a, b;
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int input() throws IOException {
        int number = Integer.parseInt(reader.readLine());
        return number;
    }


        public void calcul() throws IOException {
            switch (reader.readLine()) {

                case "+":
                    int sum = a + b;
                    System.out.println(sum);
                    break;
                case "-":
                    sum = a - b;
                    System.out.println(sum);
                    break;
                case "*":
                    sum = a * b;
                    System.out.println(sum);
                    break;
                case "/":
                    sum = a / b;
                    System.out.println(sum);
                    break;
            }


        }
    }
