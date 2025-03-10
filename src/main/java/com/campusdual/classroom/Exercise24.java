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
        //mientras no este vacia la coleccion,
        // eliminamos cada elemento y se muestran

        System.out.println("\nElementos eliminados");
        while (!queue.isEmpty()) {

            System.out.println(queue.poll());

        }
    }

    public static void main(String[] args) {

        //se imprime la coleccion
        //refactorizado
        printAndEmptyQueue(createQueue());
    }

}
