package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class Solution43Test {

    @Test
    void createWebsite() {
        Solution43 test43 = new Solution43();

        test43.createWebsite("Test","Me",true,true);

        File file = new File("website/test");
        assertTrue(file.exists());
    }
}