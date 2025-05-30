import com.xmacedo.problemStatement1.TheBruteForceWay;
import com.xmacedo.problemStatement1.TheSmarterApproach;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Random;
import static org.junit.Assert.assertTrue;

public class SmarterApproachTest {
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
        int result = TheSmarterApproach.countPairs(arr, target);

        // Valida apenas que o código roda sem erros
        System.out.println("Total of pairs found: " + result);

        assertTrue(result >= 0);
    }
}
