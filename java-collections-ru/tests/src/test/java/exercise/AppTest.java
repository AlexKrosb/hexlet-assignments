package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    List<Integer> numbers;
    int count;

    @Test
    void testTake() {
        // BEGIN
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        int count = 4;
        assertThat(App.take(numbers, count)).contains(1,2,3,4);
        assertThat((App.take(numbers, count)).size()).isEqualTo(4);
        // END
    }
    @Test
    void testTake1() {
        List<Integer> numbers = new ArrayList<>();
        int count = 1111;
        assertThat((App.take(numbers, count)).size()).isEqualTo(0);
    }
    @Test
    void testTake2() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        int count = 15;
        assertThat((App.take(numbers, count)).size()).isEqualTo(3);
        assertThat(App.take(numbers, count)).contains(1,2,3);
        org.junit.jupiter.api.Assertions.assertEquals(numbers.get(2), 3);
    }
    @Test
    void testTake3() {
        List<Integer> numbers = new ArrayList<>();
        int count = 0;
        assertThat((App.take(numbers, count)).size()).isEqualTo(0);
    }
}
