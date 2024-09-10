import Huffman.*;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        ArrayList<Node> caracteres = new ArrayList<>(){{ // Lista de elementos a codificar
            add(new Node(0.40, null, null));
            add(new Node(0.20, null, null));
            add(new Node(0.12, null, null));
            add(new Node(0.08, null, null));
            add(new Node(0.05, null, null));
            add(new Node(0.05, null, null));
            add(new Node(0.10, null, null));
        }};
        PriorityQueue<Node> colaDeCaracteres = new PriorityQueue<>(Comparator.comparingDouble(Node::getFrecuencia)); // Instanciar la cola de prioridad
        colaDeCaracteres.addAll(caracteres); // Añadir todos los elementos del codigo de Huffman a la cola
        while(colaDeCaracteres.size() > 1){
            Node nodoDerecho = colaDeCaracteres.poll();
            Node nodoIzquierdo = colaDeCaracteres.poll();
            Node padre = new Node(nodoIzquierdo.getFrecuencia() + nodoDerecho.getFrecuencia(), nodoIzquierdo, nodoDerecho);
            colaDeCaracteres.add(padre);
        }
        Node root = colaDeCaracteres.poll();
        root.preOrderSearch(root);
    }
}