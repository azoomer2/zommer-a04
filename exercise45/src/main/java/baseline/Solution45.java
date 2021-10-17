package baseline;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution45 {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        readFile rf = new readFile();
        writeFile wf = new writeFile();

        //Take output file name in
        System.out.print("Enter the output file name: ");
        String outputName = scan.nextLine();
        rf.readInputFile();
        //call readFile()
        List<String> list = rf.getList();
        //call writeFile()

        wf.writeToFile(outputName,list);
    }
}
