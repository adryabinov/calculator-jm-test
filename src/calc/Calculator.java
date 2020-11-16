package calc;


public class Calculator {

    int firstArg, secondArg;
    char operand;

    public Calculator(String _inputString, String _type) {

        if (_type.equals("Dec")) {
            firstArg = DecParser.getFirstNumber(_inputString);
            secondArg = DecParser.getSecondNumber(_inputString);
        }

        if (_type.equals("Rom")) {
            firstArg = RomParser.getFirstNumber(_inputString);
            secondArg = RomParser.getSecondNumber(_inputString);
        }

        operand = Parser.getOperand(_inputString);
    }

    public int calculated() {
        if (operand == '+') {
            return  firstArg + secondArg;
        }

        if (operand == '-') {
            return firstArg - secondArg;
        }

        if (operand == '/') {
            return firstArg / secondArg;
        }

        return firstArg * secondArg;
    }
}
