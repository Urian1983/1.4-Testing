package level2;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AsserterTest {

    private Asserter asserter;

    @BeforeEach
    void setUp() {
        asserter = new Asserter("testing");
    }

    @Test
    void equalIntegersTest(){
        int a = 15;
        int b = 15;
        assertThat(a == b);
    }

    @Test
    void nonEqualIntegersTest(){
        int a = 44;
        int b = 15;
        assertThat(a != b);
    }

    @Test
    void nonEqualObjectsTest(){
        Asserter asserter2 = new Asserter("joy");
        assertThat(asserter).isNotEqualTo(asserter2);
    }

    @Test
    void equalIntegerArrayTest(){
        int[] a = {10, 20, 30, 40};
        int[] b = {10, 20, 30, 40};
        assertThat(a).isEqualTo(b);
    }

    @Test
    void arrayListOrderinsertionTest() {
        int numero = 1;
        String frase = "Hola";
        Asserter assertN = new Asserter("boy");

        ArrayList<Object> objectTest = new ArrayList<>();

        objectTest.add(numero);
        objectTest.add(frase);
        objectTest.add(assertN);

        assertThat(objectTest).contains(numero, frase, assertN);
        assertThat(objectTest.get(0)).isEqualTo(numero);
        assertThat(objectTest.get(1)).isEqualTo(frase);
        assertThat(objectTest.get(2)).isEqualTo(assertN);
    }

    @Test
    void testMapHasKey(){
        Map<String, Object> map = new HashMap<>();

        Asserter asserter2 = new Asserter("roy");

        map.put("535",asserter);
        map.put("755",asserter2);

        assertThat(map).containsKey("755");
    }

    @Test
    void testArrayOutOfBounds(){
            List<Integer> listToOutbound = new ArrayList<>();
            Exception exception = null;
            try {
                listToOutbound.get(0);
            } catch (Exception e) {
                exception = e;
            assertThat(exception)
                    .isInstanceOf(IndexOutOfBoundsException.class)
                    .hasMessageContaining("Index");
        }
    }













}
