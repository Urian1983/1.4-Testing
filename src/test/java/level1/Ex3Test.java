package level1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Ex3Test {

    @Test
    void testIndexOutOfBounds() {
        List<Integer> listToOutbound = new ArrayList<>();
        assertThrows(IndexOutOfBoundsException.class, () -> {
            for (int i = 0; i < listToOutbound.size() + 1; i++) {
                listToOutbound.get(i);
            }
        });
    }
}



