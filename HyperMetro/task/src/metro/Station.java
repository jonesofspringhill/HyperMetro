package metro;

/*
 *  Station class contains information about each station
 *  Also contains links for next (and previous) station.
 *  Station could be generalised to 'Location' which would allow
 *  depots or other items to be linked in to the list
 */
class Station {
    private Station next;
    final private String name;

    Station (String name) {
        this.name = name;
        this.next = null;
    }

    public void setNext(Station next) {
        this.next = next;
    }

    public Station getNext() {
        return next;
    }

    public String getName() {
        return name;
    }
}

