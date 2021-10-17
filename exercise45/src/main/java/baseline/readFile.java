package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class readFile {

    private ArrayList<String> list;

    public void readInputFile() throws FileNotFoundException {
        //initialize list
        list = new ArrayList<>();
        //new file for input
        File file = new File("data/exercise45_input.txt");
        //new Scanner

        try (Scanner sc = new Scanner(file)) {

            //while scanner.hasnext()
            while (sc.hasNext()) {
                String lineIn = sc.nextLine();
                list.add(lineIn);
            }
            //read a line and store it to the list
        }
    }
    public List<String> getList()
    {
        //return list
        return list;
    }


}
