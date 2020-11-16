package calc;

public class Answer {
    String answer;

    public Answer(Integer _inputInt, String _type) {
        if (_type.equals("Dec")) {
            answer = Integer.toString(_inputInt);
        }

        if (_type.equals("Rom")) {
            answer = Converter.intToRom(_inputInt);
        }
    }
}
