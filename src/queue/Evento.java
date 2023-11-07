package queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 *
 Crear una clase Asistente.
 Volver la cola no de enteros sino de asistentes
 Termina la implementación del método "procesarSiguienteCompra", reduciendo la cantidad de tickets disponibles dependiendo de los tickets comprados por el asistente.
 Cuando se venden todos los tickets se muestra un mensaje "Sold out"
 Todo a través de una interfaz de consola.
 */
public class Evento {
    Queue<Integer> cola;
    int aforo;
    int cantDisponibles;

    public Evento(int aforo) {
        this.aforo = aforo;
        this.cantDisponibles = aforo;
        this.cola = new LinkedList();
    }

    public void registrarComprador(int tiquetesAComprar){
        this.cola.add(tiquetesAComprar);
    }

    public void procesarSiguienteCompra() {
        // FIFO -> First In First Out
        Object sgte = this.cola.remove();
        // Agregar validación contra el aforo
        // Reducir la cantidad de boletas disponibles
    }
}
