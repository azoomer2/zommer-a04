package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class writeFileTest {

    @Test
    void writeToFile() throws IOException {
        writeFile wfTest = new writeFile();
        List<String> testList = new ArrayList<>();
        testList.add("Test List");

        wfTest.writeToFile("testout.txt",testList);

        File file = new File("data/testout.txt");
        assertTrue(file.exists());

    }
}