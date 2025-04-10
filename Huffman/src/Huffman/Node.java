package Huffman;

import java.sql.SQLOutput;

public class Node {
    private double frecuencia;
    private Node nodoIzquierdo;
    private Node nodoDerecho;

    public Node(double frecuencia,Node nodoIzquierdo, Node nodoDerecho ){
        this.frecuencia = frecuencia;
        this.nodoIzquierdo = nodoIzquierdo;
        this.nodoDerecho = nodoDerecho;
    }

    public Node getNodoDerecho() {
        return nodoDerecho;
    }

    public double getFrecuencia() {
        return frecuencia;
    }

    public Node getNodoIzquierdo() {
        return nodoIzquierdo;
    }

    public void preOrderSearch(Node nodo){
        if(nodo != null){
            System.out.println(nodo.getFrecuencia());
            preOrderSearch(nodo.nodoIzquierdo);
            preOrderSearch(nodo.nodoDerecho);
        }
    }
}
