package stack;

import java.util.LinkedList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        TextEditor te = new TextEditor();

        te.write("Hola");
        te.write("Mundo");

        System.out.println(te.undo());
        System.out.println(te.undo());

    }
}