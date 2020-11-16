package calc;

public class DecParser extends Parser {

    public static int getFirstNumber(String _inputString) {
            int firstSpaceInd = _inputString.indexOf(' ');
            return Integer.parseInt(_inputString.substring(0, firstSpaceInd));
    }

    public static int getSecondNumber(String _inputString) {
        int lastSpaceInd = _inputString.lastIndexOf(' ');
        return Integer.parseInt(_inputString.substring(lastSpaceInd + 1));
    }

}