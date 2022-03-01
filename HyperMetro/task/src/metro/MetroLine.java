package metro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/*
 *  MetroLine class
 *  name: the name of the line (e.g. "Metropolitan Line")
 *  dataFile: a text file containing the names of each station, one per line
 *  stations: a single linked list of stations
 *  head, tail: references to the head and tail of the linked list
 */
class MetroLine {
    private String name;
    private String dataFile;
    private Station tail;
    private Station head;
    private ArrayList<Station> stations = new ArrayList<>();

    /*
     *  Initialise a metro line from data in the provided file
     */
    MetroLine (String fileName) {
        this.dataFile = fileName;
        this.buildStationList();
        this.head = stations.get(0);
        this.tail = stations.get(stations.size()-1);
    }

    /*
     *  Add a station to the list and update the tail reference
     */
    private void addStationByName(String strName) {
        Station station = new Station (strName);
        stations.add(station);
        if (tail != null) {
            tail.setNext(station);
        }
        tail = station;
    }

    /*
     *  Build the singly linked list of stations
     */
    private void buildStationList() {

        try {
            File fd = new File(this.dataFile);
            Scanner sc = new Scanner(fd);

            // begin the line at the depot
            addStationByName("depot");

            // Build station list
            // The constructor sets the name and next to null
            // Conditionally update the next of the previous station
            while (sc.hasNextLine()) {
                addStationByName(sc.nextLine().trim());
            }
            // finish the line at the depot
            addStationByName("depot");

        } catch (FileNotFoundException e) {
            System.out.println("Error! Such a file doesn't exist!");
        }
    }

    /*
     *  Some getters and setters
     */
    public Station getHead() {
        return head;
    }

    public Station getTail() {
        return tail;
    }

    public String getName() {
        return name;
    }
    // Done getting and setting


    /*
     *  Print up to n stations separated by ' - '
     *      The line terminates with a depot (which needs to be printed)
     *      3 locations (including 'depot') per line
     */
    public void printStations(int n) {
        int from = 0;
        int to = n;
        Station station = head;
        String strStation = "";

        ListIterator<Station> iterator = stations.listIterator();
        while (iterator.hasNext()) {
            // get the next station
            Station s = iterator.next();

            List<Station> stationsTuple = new ArrayList<>(stations.subList(from, to));

            for(Station sIter : stationsTuple) {
                if (strStation == "") {
                    strStation = sIter.getName();
                } else {
                    strStation = String.format("%s - %s", strStation, sIter.getName());
                }
            }
            System.out.println(strStation);
            strStation = "";

            if (to < stations.size()) {
                from++;
                to = Integer.min(from + n, stations.size());
            } else {
                break;
            }
        }
    }
}

