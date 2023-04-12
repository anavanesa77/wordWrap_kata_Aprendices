import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import wordwrap.wordwrap_kata_aprendices.Wrapper;

class WrapperShould {

    @Test
    void validate_string_and_number_Column() {
        String text = "Prueba";
        int columnNumber = 6;
        String textRes = Wrapper.Wrap(text, columnNumber);
        Assertions.assertEquals("Prueba", textRes);
    }

    @Test
    void column_number_is_bigger_than_String() {
        String text = "Prueba";
        int columnNumber = 9;
        String textRes = Wrapper.Wrap(text, columnNumber);
        Assertions.assertEquals("La cadena es menor que el número de columna.", textRes);
    }

    @Test
    void no_cut_word() {
        String text = "Mi casa bonita blanca.";
        int columnNumber = 17;
        String textRes = Wrapper.Wrap(text, columnNumber);
        Assertions.assertEquals("Mi casa bonita", textRes);
    }
}