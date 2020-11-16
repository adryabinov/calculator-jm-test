package calc;

import java.util.regex.Pattern;

class InputException extends Exception {
    public String toString()
    {
        return "Error. Bad expression.";
    }
}

public class Valid {

    String inputString;
    String inputType;

    public Valid(String _input) {
        try {
            if (!(Valid.dec(_input) | Valid.rom(_input)))
                throw new InputException();
        }

        catch (InputException e) {
            System.out.println("Exception: "+e.toString());
            System.exit(0);
            return;
        }

        if (Valid.dec(_input)) {
            inputString = _input;
            inputType = "Dec";
        }

        if (Valid.rom(_input)) {
            inputString = _input;
            inputType = "Rom";
        }
    }

    private static boolean dec(String _inputString) {
        return (Pattern.matches(
                "([123456789]|10) [+-/*] ([123456789]|10)",
                _inputString));
    }

    private static boolean rom(String _inputString) {
        return (Pattern.matches(
                "(I|II|III|IV|V|VI|VII|VIII|IX|X) [+-/*] (I|II|III|IV|V|VI|VII|VIII|IX|X)",
                _inputString));
    }
}
