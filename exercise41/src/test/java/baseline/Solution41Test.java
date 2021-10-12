package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution41Test {

    @Test

    void nameSorter() {

        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> test = new ArrayList<>();

        test.add("Joey");
        test.add("Alex");
        test.add("Carol");
        test.add("Kyle");



        List<String> expected = new ArrayList<>();
        expected.add("Alex");
        expected.add("Carol");
        expected.add("Joey");
        expected.add("Kyle");





        assertEquals(expected, Solution41.nameSorter(test));



    }
}