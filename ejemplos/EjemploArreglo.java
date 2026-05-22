package ejemplos;
public class EjemploArreglo {

    public static void main(String[] args) {

        // Declaración e inicialización del arreglo
        int[] notas = {85, 90, 78, 92, 88};

        // Mostrar todos los elementos
        System.out.println("Notas del estudiante:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("  Nota " + (i + 1) + ": " + notas[i]);
        }

        // Calcular el promedio
        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma = suma + notas[i];
        }

        double promedio = (double) suma / notas.length;
        System.out.println("Promedio: " + promedio);
    }
}