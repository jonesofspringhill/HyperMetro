package com.mypackage;

class Curve {
    // pass
}

interface DrawingTool {
    void draw(Curve curve);
}

class Pencil implements DrawingTool {
    public void draw(Curve curve) {
        System.out.println("Scribble, scribble, scribble");
    }
}

class Cards implements DrawingTool {
    public void draw(Curve curve) {
        System.out.println("Jack, Queen, King, Ace");
    }
}

public class Main {
    public static void drawSomething(DrawingTool tool, Curve curve) {
        tool.draw(curve);
    }

    public static void main(String[] args) {
        DrawingTool MrScribble = new Pencil();
        DrawingTool deck = new Cards();
        Curve c = new Curve();

        drawSomething(MrScribble, c);
        drawSomething(deck, c);
    }
}