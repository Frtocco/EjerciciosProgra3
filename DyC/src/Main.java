public class Main {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7,8};
        System.out.println(buscarXEnVectorOrdenado(nums,6,0, nums.length-1));

        System.out.println("2 elevado a 8 "+potenciaDeN(2,8));
        System.out.println("2 elevado a 5 " + cualquierPotencia(2,5));

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

}