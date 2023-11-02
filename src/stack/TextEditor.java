package stack;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Agregar un método ImprimirTexto/PrintText que va a mostar por consola el resultado de la pila de acciones.
 * Se deben leer todas las palabras por consola, y se debe agregar un par de acciones que se escuchan de estas palabras ingresadas.
 * Si se ingresa -1 debe deshacer la última palabra ingresada.
 * Si se igresa +print debe mostrar el texto escrito.
 *
 * while(true){
 * 	String texto = sc.next()
 * 	if(texto == -1)-....
 * 	if(texto == __).....
 * }
 */
public class TextEditor {
    Stack<String> actions;

    public TextEditor() {
        this.actions = new Stack();
    }

    public void write(String word)  {
        this.actions.push(word);
    }

    public String undo(){
        return this.actions.pop();
    }
}
