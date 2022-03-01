package metro;

import java.io.*;

/*
 * One Line Metro
 *
 * 1. A single linked list to print out metro stations read in from a file (given as argument).
 * 2. The head and tail of the list is represented as 'depot'
 * 3. Stations are printed out 3 per line including 'depot' separated by a hyphen: ' - '
 * 4. If the file is empty, print nothing
 * 5. Error checking:
 *    a. If the file doesn't exist: 'Error! Such a file doesn't exist!'
 */
public class Main {

    public static void main(String args[]) throws FileNotFoundException {

        String stationsFile = args[0];
        MetroLine metropolitan = new MetroLine(stationsFile);
        metropolitan.printStations(3);
    }
}

