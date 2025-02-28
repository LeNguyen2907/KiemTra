import static org.junit.jupiter.api.Assertions.*;

import org.example.ktnc_01.ArrayUtils;
import org.junit.jupiter.api.Test;

public class ArrayUtilsTest {

    @Test
    void testSum_EmptyArray() {
        int[] numbers = {};
        assertEquals(0, ArrayUtils.sum(numbers), "Tổng mảng rỗng phải bằng 0");
    }

    @Test
    void testSum_SingleElement() {
        int[] numbers = {5};
        assertEquals(5, ArrayUtils.sum(numbers), "Tổng mảng chỉ có một phần tử");
    }

    @Test
    void testSum_PositiveNumbers() {
        int[] numbers = {1, 2, 3, 4, 5};
        assertEquals(15, ArrayUtils.sum(numbers), "Tổng các số dương");
    }

    @Test
    void testSum_NegativeNumbers() {
        int[] numbers = {-1, -2, -3, -4, -5};
        assertEquals(-15, ArrayUtils.sum(numbers), "Tổng các số âm");
    }

    @Test
    void testSum_MixedNumbers() {
        int[] numbers = {-2, -1, 0, 1, 2};
        assertEquals(0, ArrayUtils.sum(numbers), "Tổng của mảng chứa số âm, dương và 0");
    }

    @Test
    void testSum_NullArray() {
        assertThrows(IllegalArgumentException.class, () -> {
            ArrayUtils.sum(null);
        }, "Mảng null phải ném ra ngoại lệ");
    }
}
