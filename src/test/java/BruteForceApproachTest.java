import com.xmacedo.problemStatement1.TheBruteForceWay;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BruteForceApproachTest {

    @Test
    public void simpleTest() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 5, 7, -1, 5));
        Integer target = 6;

        //Count pair
        int result = TheBruteForceWay.countPairs(arr, target);

        // Check if you found the target quantity
        assertEquals(3, result);

    }

    @Test
    public void noPairsTest() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        int target = 10;

        int result = TheBruteForceWay.countPairs(arr, target);

        // No pair adds up to 10
        assertEquals(0, result);
    }

    @Test
    public void emptyArrayTest() {
        ArrayList<Integer> arr = new ArrayList<>();
        int target = 5;

        int result = TheBruteForceWay.countPairs(arr, target);

        assertEquals(0, result);
    }

    @Test
    public void singleElementArrayTest() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(5));
        int target = 5;

        int result = TheBruteForceWay.countPairs(arr, target);

        assertEquals(0, result);
    }

    @Test
    public void negativeNumbersTest() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(-3, 1, 4, 2, -1));
        int target = 1;

        // Pairs: (-3,4), (2,-1)
        int result = TheBruteForceWay.countPairs(arr, target);

        assertEquals(2, result);
    }

    @Test
    public void largeArrayTest() {
        int arraySize = 100_000;
        int target = 100;

        ArrayList<Integer> arr = new ArrayList<>(arraySize);
        Random random = new Random(42);

        // Fills the array with random numbers between 0 and 100
        for (int i = 0; i < arraySize; i++) {
            arr.add(random.nextInt(101));
        }

        // run the method
        int result = TheBruteForceWay.countPairs(arr, target);

        // Valida apenas que o código roda sem erros
        System.out.println("Total of pairs found: " + result);

        assertTrue(result >= 0);
    }

}
