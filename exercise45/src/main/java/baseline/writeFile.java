package baseline;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class writeFile {

    public void writeToFile(String output, List<String> list) throws IOException {
        //new file writer
        try (FileWriter writer = new FileWriter("data\\" + output)) {
            //give writer file location and name


            //loop through list
            for (String o : list) {
                String temp = o;

                //replace utilize with use
                temp = temp.replace("utilize", "use");

                writer.write(temp + "\n");

            }
        }

    }

}
