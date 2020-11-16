package calc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final String INPUT;
        INPUT = in.nextLine();

        Valid vInput = new Valid(INPUT);
        Calculator calc = new Calculator(vInput.inputString, vInput.inputType);
        Answer output = new Answer(calc.calculated(), vInput.inputType);
        System.out.println(output.answer);

    }
}
