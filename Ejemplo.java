
public class Ejemplo {
    public static void main(String[] args) {
        int[] matriz = new int[4];
        System.out.print("\nValores: [ ");
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = i + 1;
            // imprime los valores del vector, estos estan almacenados en un arreglo
            // unidimensional
            System.out.print(matriz[i] + " ");
        }
        System.out.println("]\nMedia de los n primeros elementos del vector: " + media(matriz, 2) + "\n");
    }

    static float media(int datos[], int n) {
        int i;
        float suma = 0;
        for (i = 0; i < n; i++)
            suma = suma + datos[i];
        return suma / n;
    }
}