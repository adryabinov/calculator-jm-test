package calc;

import java.util.HashMap;
import java.util.Map;

public class Converter {
    public static int romToInt(String _inputString) {
        Map<String, Integer> roman_numerals = new HashMap<>();
        roman_numerals.put("I", 1);
        roman_numerals.put("II", 2);
        roman_numerals.put("III", 3);
        roman_numerals.put("IV", 4);
        roman_numerals.put("V", 5);
        roman_numerals.put("VI", 6);
        roman_numerals.put("VII", 7);
        roman_numerals.put("VIII", 8);
        roman_numerals.put("IX", 9);
        roman_numerals.put("X", 10);

        return roman_numerals.get(_inputString);
    }

    public static String intToRom(Integer _input) {
            if (_input == 0)
                return "nulla";
            StringBuilder _output = new StringBuilder();

            if (_input < 0)
                _output.append("-");
                _input = -_input;

            while (_input >= 100) {
                _output.append("C");
                _input -= 100;
            }
            while (_input >= 90) {
                _output.append("XC");
                _input -= 90;
            }
            while (_input >= 50) {
                _output.append("L");
                _input -= 50;
            }
            while (_input >= 40) {
                _output.append("XL");
                _input -= 40;
            }
            while (_input >= 10) {
                _output.append("X");
                _input -= 10;
            }
            while (_input >= 9) {
                _output.append("IX");
                _input -= 9;
            }
            while (_input >= 5) {
                _output.append("V");
                _input -= 5;
            }
            while (_input >= 4) {
                _output.append("IV");
                _input -= 4;
            }
            while (_input >= 1) {
                _output.append("I");
                _input -= 1;
            }
            return _output.toString();
        }
    }


