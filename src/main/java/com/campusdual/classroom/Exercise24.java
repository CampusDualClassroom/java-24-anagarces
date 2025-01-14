package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {
    public static Queue<String> createQueue() {
        //creamos una coleccion de tipo cola y poblamos
        Queue<String> customQueue = new LinkedList<>();

        customQueue.offer("Smith");
        customQueue.offer("Montessori");
        customQueue.offer("Peralta");
        customQueue.offer("House");

        return customQueue; //devolvemos la nueva coleccion
    }

    public static void printAndEmptyQueue(Queue<String> queue) {
        //primero mostramos por consola los elementos sin eliminarlos
        System.out.println("\nElementos de la coleccion");
        queue.forEach((name) -> {
            System.out.println(name);
        });

        //luego recorremos cada elemento y mientras no este vacia la coleccion,
        // eliminamos cada elemento y se muestran

        System.out.println("\nElementos eliminados");
        while (!queue.isEmpty()) {

            System.out.println(queue.poll());

        }
    }

    public static void main(String[] args) {

        //creamos una nueva coleccion llamando al metodo correspondiente
        Queue<String> myCustomQueue = createQueue();

        //se imprime la coleccion
        printAndEmptyQueue(myCustomQueue);
    }

}
