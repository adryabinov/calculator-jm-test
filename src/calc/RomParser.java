package calc;

public class RomParser extends Parser {

    public static int getFirstNumber(String _inputString) {
        int firstSpaceInd = _inputString.indexOf(' ');
        return Converter.romToInt(_inputString.substring(0, firstSpaceInd));
    }

    public static int getSecondNumber(String _inputString) {
        int lastSpaceInd = _inputString.lastIndexOf(' ');
        return Converter.romToInt(_inputString.substring(lastSpaceInd + 1));
    }
}
