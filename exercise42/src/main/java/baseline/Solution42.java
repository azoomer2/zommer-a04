package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution42 {

    private List<String> fName = new ArrayList<>();
    private List<String> lName = new ArrayList<>();
    private List<String> salary = new ArrayList<>();

    public void csvScanner(String filePath) throws FileNotFoundException {
        //Create new Scanner instance
        Scanner scan = new Scanner(new File(filePath));

        try (scan) {
            //set delimiter to ,
            scan.useDelimiter(",");


            //while loop for scanner having values
            while (scan.hasNext()) {
                //save next 3 values to fName, lName, salary
                lName.add(scan.next());
                fName.add(scan.next());
                salary.add(scan.next());
            }
        }
    }

    public String getlName(int index) //FOR TESTING
    {
        return lName.get(index);
    }
    public String getfName(int index) //FOR TESTING
    {
        return fName.get(index);
    }
    public String getSalary(int index) //FOR TESTING
    {
        return salary.get(index);
    }

    private void tablePrinter()
    {
        //format and print output of csvScanner
        String header1 = "Last";
        String header2 = "First";
        String header3 = "Salary";


        System.out.printf("%-10s %-10s %-10s %n",header1,header2,header3);
        System.out.printf("----------------------------%n");

        for(int i=0; i<lName.size(); i++)
        {
            System.out.printf("%-10s %-10s %-10s ",lName.get(i),fName.get(i),salary.get(i));
        }
    }


    public static void main(String[] args) throws FileNotFoundException {

        Solution42 main = new Solution42();
        String filePath = "data/exercise42_input.txt";

        //call csvScanner()
        main.csvScanner(filePath);
        //call tablePrinter()
        main.tablePrinter();

    }

}
