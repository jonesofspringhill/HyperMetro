class Clock {

    int hours = 12;
    int minutes = 0;

    Clock(int hh, int mm) {
        hours = hh;
        minutes = mm;
    }
    Clock () {
        this(12, 0);
    }

    public String getTime() {
        return  String.format("%02d:%02d", hours, minutes);
    }

    public void next() {
        // implement me
        minutes += 1;
        if (minutes > 59) {
            minutes = 0;
            hours = ((hours % 12) == 0 ? 1 : hours+1);
        }
    }
}

class Main {

    public static void main(String[] args) {
        Clock c = new Clock();

        for (int h = 0; h < 13; h++) {
            c.hours = h;
            c.minutes = 58;

            for (int i = 0; i < 3; i++) {
                c.next();
                System.out.printf(c.getTime() + "\n");
            }
        }
        c.hours = 10; c.minutes = 32;

    }
}