package level1.ex2.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DniModelTest {

    private DniModel dniModel;

    @BeforeEach
    void setUp(){
        dniModel = new DniModel();
    }

    @Test
    void setNumberDni() {
        dniModel.setNumberDni("12345678Z");
        assertNotNull(dniModel);
    }

    @Test
    void testChecktDniLetterTrue(){
        assertTrue(dniModel.checkDniLetter(12345678,"Z"));
    }

    @Test
    void testCheckDniLetterFalse(){
        assertFalse(dniModel.checkDniLetter(12345678,"X"));
    }

    @Test

    void testDniInvalidSize(){
        assertFalse(dniModel.checkDni("123478F"));
    }

    @Test
    void testCheckDni_InvalidNumber() {
        boolean result = dniModel.checkDni("ABC45678Z");
        assertFalse(result);
    }

    @Test
    void checkDni() {
    }

    @Test
    void checkDniLetter() {
    }
}