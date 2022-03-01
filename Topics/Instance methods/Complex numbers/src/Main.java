class Complex {

    double real;
    double image;

    // write methods here
    public void add (Complex c) {
        this.real += c.real;
        this.image += c.image;
    }

    public void subtract (Complex c) {
        this.real -= c.real;
        this.image -= c.image;
    }
}