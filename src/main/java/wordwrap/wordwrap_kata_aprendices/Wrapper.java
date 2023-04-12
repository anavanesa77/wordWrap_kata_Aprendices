package wordwrap.wordwrap_kata_aprendices;

public class Wrapper {

    public static String Wrap(String text, int columnNumber) {
        if (columnNumber <= text.length()) {
            if (text.contains(" ")) {
                int i = columnNumber + 1;
                do {
                    i--;
                } while (text.charAt(i) != ' ');
                text = text.substring(0, i);
            } else {
                text = text.substring(0, columnNumber);
                return text;
            }
            return text;
        }
        return "La cadena es menor que el número de columna.";
    }
}