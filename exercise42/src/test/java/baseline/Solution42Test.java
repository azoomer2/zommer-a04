package baseline;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class Solution42Test {

    @Test
    void csvScanner() throws FileNotFoundException {

        Solution42 testClass = new Solution42();

        testClass.csvScanner("data/exercise42_testinput.txt");

        String expectedL = "Ling";
        String expectedF = "Mai";
        String expectedS = "55900";

        assertEquals(expectedL,testClass.getlName(0));
        assertEquals(expectedF,testClass.getfName(0));
        assertEquals(expectedS,testClass.getSalary(0));

    }
}