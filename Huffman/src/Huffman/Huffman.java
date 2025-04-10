package Huffman;

public class Huffman {
    private String caracter;
    private double frecuencia;

    public Huffman(double frecuencia, String caracter) {
        this.caracter = caracter;
        this.frecuencia = frecuencia;
    }

    public String getCaracter() {
        return caracter;
    }

    public double getFrecuencia() {
        return frecuencia;
    }
}
