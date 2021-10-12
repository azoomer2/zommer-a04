package baseline;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Alexander Zommer
 */
public class Solution41 {


    private static ArrayList<String> takeInput() throws FileNotFoundException {
        //read from input file using scanner
        Scanner inputFile = new Scanner(new File("data/exercise41_input.txt"));

        ArrayList<String>names = new ArrayList<>();

        while(inputFile.hasNextLine()) {
            names.add(inputFile.nextLine());
        }

        //save each line to an array in ArrayList
        inputFile.close();

        return names;
    }

    public static List<String> nameSorter(List<String> names)
    {
        //Take input arraylist
        //Sort using collections.sort
        names.sort(String.CASE_INSENSITIVE_ORDER);
        //return sorted arraylist
        return names;
    }

    private static void printNames(ArrayList<String> names) throws IOException {
        //print out the supplied array list
        FileWriter output = new FileWriter("data/exercise_output.txt");
        output.write("Total of " + names.size()+" names\n");
        output.write("-----------------------\n");

        for(Object i :names){
            output.write(i+"\n");
        }

        output.close();
    }

    public static void main(String[] args) throws IOException {



        ArrayList<String> namesIn = new ArrayList<>();
        ArrayList<String> sortedNames;
        //take input from readInput class
        namesIn = takeInput();
        //nameSorter(array)
        sortedNames = (ArrayList<String>) nameSorter(namesIn);
        //printNames(array)
        printNames(sortedNames);
    }

}
