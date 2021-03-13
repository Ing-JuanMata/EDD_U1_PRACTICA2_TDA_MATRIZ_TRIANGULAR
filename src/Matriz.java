/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ING-JUANMATA
 */
public class Matriz {

    private int tam;
    private int[][] datos;

    public Matriz(int tam) {
        this.tam = tam;
        this.datos = new int[tam][tam];
        iniciarMatriz();
    }

    private void iniciarMatriz() {
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                datos[i][j] = (int) (Math.random() * 9 + 1);
            }
        }
    }

    public boolean insertarValor(int valor, int fila, int columna) {

        if (fila >= 0 && fila < tam && columna >= 0 && columna < tam) {
            datos[fila][columna] = valor;
            return true;
        }

        return false;
    }

    private int[][] llenarMatriz(int[][] data) {
        for (int[] fila : data) {
            for (int dato : fila) {
                dato = 0;
            }
        }

        return data;
    }

    public int[][] obtenerTriangularSuperior() {
        int[][] res = new int[tam][tam];
        res = llenarMatriz(res);

        for (int i = 0; i < tam; i++) {
            System.arraycopy(datos[i], i, res[i], i, tam - i);
        }

        return res;
    }

    public int[][] obtenerTriangularSuperiorInversa() {
        int[][] res = new int[tam][tam];
        res = llenarMatriz(res);

        for (int i = 0; i < tam; i++) {
            for (int j = tam - i - 1; j >= 0; j--) {
                res[i][j] = datos[i][j];
            }
        }

        return res;
    }

    public int[][] obtenerTriangularInferior() {
        int[][] res = new int[tam][tam];
        res = llenarMatriz(res);

        for (int i = tam - 1; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                res[i][j] = datos[i][j];
            }
        }

        return res;
    }

    public int[][] obtenerTriangularInferiorInversa() {
        int[][] res = new int[tam][tam];
        res = llenarMatriz(res);

        for (int i = tam - 1; i >= 0; i--) {
            for (int j = tam - i - 1; j < tam; j++) {
                res[i][j] = datos[i][j];
            }
        }

        return res;
    }

    public int[] obtenerDiagonal() {
        int res[] = new int[tam];

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (i == j) {
                    res[i] = datos[i][j];
                }
            }
        }

        return res;
    }

    public int[] obtenerDiagonalInvertida() {
        int res[] = new int[tam];

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (i + j == tam - 1) {
                    res[i] = datos[i][j];
                }
            }
        }

        return res;
    }

    public int getTam() {
        return tam;
    }

    public int[][] getDatos() {
        return datos;
    }

}
