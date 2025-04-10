import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7,8};
        System.out.println(buscarXEnVectorOrdenado(nums,6,0, nums.length-1));

        System.out.println("2 elevado a 8 "+potenciaDeN(2,8));
        System.out.println("2 elevado a 5 " + cualquierPotencia(2,5));

        int [] arrayDesordenado = {2,1,7,4,9,0,3,2,10};
        mergeSortDividingBy3(arrayDesordenado, 0, arrayDesordenado.length-1);
        System.out.println(Arrays.toString(arrayDesordenado));

        int [] elementoMayoritarioArray = {1,1,0,1,0,1,1,1,0,0};
        System.out.println("Elemento mayoritario del array " +elementoMayoritario(elementoMayoritarioArray, 0, elementoMayoritarioArray.length-1));

        int [] equiposFutbol = {1,2,3,4,5,6,7,8};
    }

    // Ejercicio 2: vectores de numeros ordenados de forma creciente, determinar si x pertenece
    public static boolean buscarXEnVectorOrdenado(int[] numeros, int x, int inicio, int fin) {
        // Simil busqueda binaria
        if (inicio > fin) {
            return false;
        }
        int medio = (inicio + fin) / 2;
        if (numeros[medio] == x) {
            return true;
        } else if (x > numeros[medio]) {
            return buscarXEnVectorOrdenado(numeros, x, medio + 1, fin);
        } else {
            return buscarXEnVectorOrdenado(numeros, x, inicio, medio - 1);
        }
    }
    // Ejercicio 3: Calcular a^n cuando n es una potencia de 2.
    public static int potenciaDeN(int a, int n){
        // En este caso n siempre va a ser una potencia de 2
        if(n == 2){
            return a*a;
        }else{
            int potencia = potenciaDeN(a,n/2);
            return potencia*potencia;
        }
    }

    public static int cualquierPotencia(int base, int exponente){
        // Aca el exponente puede ser cualquier numero natural
        if((exponente % 2)!= 0){
            return cualquierPotencia(base, exponente-1)*base;
        }
        if(exponente == 2){
            return base * base;
        } else{
            int potencia = cualquierPotencia(base, exponente/2);
            return potencia * potencia;
        }

    }

    public static Object elementoMayoritario(int [] a,int ini, int fin){
        if(ini +1 == fin){
            if(a[ini] == a[ini+1]){
                return a[ini];
            }else{
                return null;
            }
        }else{
            int mid = (ini+fin)/2;
            Object izquierda = elementoMayoritario(a,ini,mid);
            Object derecha = elementoMayoritario(a,mid, fin);
            if(izquierda == derecha){
                return izquierda;
            } else if (izquierda == null){
                return derecha;
            } else if (derecha == null) {
                return izquierda;
            }else{
                return null;
            }
        }
    }

    public static void mergeSort(int[] a, int start, int end){
        if(start<end){
            int middle = (start + end) / 2;
            mergeSort(a, start, middle);
            mergeSort(a, middle+1, end);
            merge(a,start,end);
        }
    }

    public static void merge(int[] a, int start, int end){
        int [] w = new int[end+1];
        int middle = (start + end) / 2;
        int i = start;
        int j = middle + 1;
        for(int k=0; k<= end - start; k++){
            if((j > end) || (a[i] <= a[j] && i < middle+1)){
                w[k] = a[i];
                i++;
            } else{
                w[k] = a[j];
                j++;
            }
        }
        for(int k=0; k<= end-start; k++){
            a[start + k] = w[k];
        }
    }

    public static void mergeSortDividingBy3(int[] a, int start, int end){
        if(start<end){
            // No funciona siempre
            int firstPart = (start + end)/3;
            int secondPart = firstPart*2;
            mergeSort(a, start, firstPart);
            mergeSort(a, firstPart, secondPart);
            mergeSort(a, secondPart+1, end);
            merge(a,start,end);
        }
    }


    public static void torneoFutbol(int [] equipos, int ini, int fin){
        if(ini + 1 == fin){
            System.out.println();
        }else{
                
        }
    }

}