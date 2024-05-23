package util;

import java.util.ArrayList;
import java.util.Collections;

public abstract class MisArrays {
	 /**
     * Calcula la media de los números en la lista.
     * @param notas Lista de números enteros entre 0 y 10.
     * @return La media de los elementos de la lista.
     * @throws IllegalArgumentException Si algún número de la lista no está entre 0 y 10.
     */
    public static float mediaNotas(ArrayList<Integer> notas) {
        for (int nota : notas) {
            if (nota < 0 || nota > 10) {
                throw new IllegalArgumentException("La nota " + nota + " está fuera del rango permitido [0, 10]");
            }
        }

        int sum = 0;
        for (int nota : notas) {
            sum += nota;
        }
        return (float) sum / notas.size(); // Cálculo de la media
    }
    /**
     * Calcula la mediana
     * @param notas es Lista de números enteros entre 0 y 10.
     * @return La mediana de los elementos de la lista.
     * @throws IllegalArgumentException Si algún número de la lista no está entre 0 y 10.
     */
    public static float medianaNotas(ArrayList<Integer> notas) {
        for (int nota : notas) {
            if (nota < 0 || nota > 10) {
                throw new IllegalArgumentException("La nota " + nota + " está fuera del rango permitido [0, 10]");
            }
        }
        Collections.sort(notas);
        int n = notas.size();
        if (n % 2 == 0) {
            return (notas.get(n / 2 - 1) + notas.get(n / 2)) / 2.0f;
        } else {
            return notas.get(n / 2);
        }
    }

    /**
     * Encuentra la nota máxima en la lista.
     * @param notas es una Lista de números enteros entre 0 y 10.
     * @return El valor máximo de la lista.
     * @throws IllegalArgumentException Si algún número de la lista no está entre 0 y 10.
     */
    public static int maximaNota(ArrayList<Integer> notas) {
        for (int nota : notas) {
            if (nota < 0 || nota > 10) {
                throw new IllegalArgumentException("La nota " + nota + " está fuera del rango permitido [0, 10]");
            }
        }
        int max = Collections.max(notas);
        return max;
    }

    /**
     * Encuentra la nota mínima en la lista.
     * @param notas es una Lista de números enteros entre 0 y 10.
     * @return El valor mínimo de la lista.
     * @throws IllegalArgumentException Si algún número de la lista no está entre 0 y 10.
     */
    public static int minimaNota(ArrayList<Integer> notas) {
        for (int nota : notas) {
            if (nota < 0 || nota > 10) {
                throw new IllegalArgumentException("La nota " + nota + " está fuera del rango permitido [0, 10]");
            }
        }
        int min = Collections.min(notas);
        return min;
    }

    
}
	

