import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class CheckIfAllBitsOfANumberAreSet {

    @Test
    public static void main(String[] args) {
        int input = 7;

        assertTrue(checkIfSet(7));
        assertFalse(checkIfSet(14));
        assertFalse(checkIfSet(0));


    }

    static boolean checkIfSet(int input) {
        return (input & (input + 1)) == 0;
    }
}
