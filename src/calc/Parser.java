package calc;

public class Parser {

    public static Character getOperand(String _inputString) {
        int firstSpaceInd = _inputString.indexOf(' ');
        return _inputString.charAt(firstSpaceInd + 1);
    }
}
