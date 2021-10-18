package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fileReader {

    private ArrayList<String> list;
    private ArrayList<String> search;
    private ArrayList<Integer> finds;
    private ArrayList<String> init;

    void readFile() throws FileNotFoundException {
        list = new ArrayList<>();
        search = new ArrayList<>();
        finds = new ArrayList<>();
        init = new ArrayList<>();

        File file = new File("data/exercise46_input.txt");

        try(Scanner sc = new Scanner(file)){
            int index = 0;
            int count = 0;
            while(sc.hasNext())
            {
               String in = sc.next();
               init.add(in);
            }

           while(sc.hasNext()) {
               for (int i = 0; i < init.size() - 1; i++) {
                   String lineIn = sc.nextLine();
                   if (!search.contains(lineIn)) {
                       search.add(index, lineIn);
                       finds.add(index, count);
                       while (sc.hasNext()) {
                           String temp = sc.nextLine();
                           if (temp.equals(lineIn)) {
                               count++;
                               finds.add(index, count);
                           }

                       }
                   }

                    index++;
               }
           }
        }
        System.out.printf("%s %d",search.get(0),finds.get(0));
    }
   // public List getList()
    {
       // return list;
    }

    //public int countEntries(String searchIndex, List list)
    {


        //Go through words one by one
        //if temp = searchIndex,
            //counter++

        //return counter;

    }
}
