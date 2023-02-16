package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(400);
        zofka.turnRight(90);
        zofka.penDown();

        nakresliDomecky();

        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(400);
        zofka.penDown();

        nakresliObdelnik();
        zofka.move(120);

        nakresliTrojuhelnik();
        zofka.turnRight(15);

        nakresliNohy();

        zofka.turnRight(60);
        zofka.penUp();
        zofka.move(120);
        zofka.penDown();
        zofka.turnRight(60);

        nakresliNohy();

    }

    private void nakresliObdelnik() {
        for (int i = 0; i < 2; i++) {
            zofka.move(120);
            zofka.turnLeft(90);
            zofka.move(100);
            zofka.turnLeft(90);
        }
    }
    private void nakresliTrojuhelnik() {

        zofka.turnLeft(45);
        zofka.move(70);
        zofka.turnLeft(90);
        zofka.move(70);
    }

    private void nakresliDomecek() {
        for (int i = 0; i < 4; i++) {
            zofka.move(100);
            zofka.turnLeft(90);
    }
        zofka.move(100);
        zofka.turnLeft(45);
        zofka.move(70);
        zofka.turnLeft(90);
        zofka.move(70);
    }

    private void nakresliDomecky() {
        for (int i = 0; i < 4; i++) {
            nakresliDomecek();
            zofka.turnLeft(45);
            zofka.penUp();
            zofka.move(100);
            zofka.turnLeft(90);
            zofka.move(300);
            zofka.turnLeft(90);
            zofka.penDown();
        }
    }

        private void nakresliNohy() {

        zofka.move(35);
        zofka.turnRight(120);
        zofka.penUp();
        zofka.move(35);
        zofka.turnRight(120);
        zofka.penDown();
        zofka.move(35);
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
