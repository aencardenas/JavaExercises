package com.learning.exercise21;

public class Exercise_21 {
    public static void main(String[] args) {

        int[][] matrizPrincipal = {

                {1,26,36,47,5,6,72,81,95,10},
                {11,12,13,21,41,22,67,20,10,61},
                {56,78,87,90,9,90,17,12,87,67},
                {41,87,24,56,97,74,87,42,64,35},
                {32,76,79,1,36,5,67,96,12,11},
                {99,13,54,88,89,90,75,12,41,76},
                {67,78,87,45,14,22,26,42,56,78},
                {98,45,34,23,32,56,74,16,19,18},
                {24,67,97,46,87,13,67,89,93,24},
                {21,68,78,98,90,67,12,41,65,12}

        };

        int[][] matrizBusqueda = {
                {36,5,67},
                {89,90,75},
                {14,22,26}
        };

        if(BuscarMatriz(matrizPrincipal,matrizBusqueda)){
            System.out.println("La matriz de busqueda se encuentra en la matriz principal");

        }else{
            System.out.println("La matriz de busqueda no se encuentra en la matriz principal");
        }

    }

    public static boolean BuscarMatriz(int[][] matrizPrincipal, int[][] matrizBusqueda){

        int n = matrizPrincipal.length;
        int m = matrizPrincipal[0].length;
        int p = matrizBusqueda.length;
        int q = matrizBusqueda[0].length;
        String indices = "";

        for (int i = 0; i <= n-p; i++) {
            for (int j = 0; j < m-q ; j++) {
                boolean encontrada = true;
                for (int k = 0; k < p; k++) {
                    for (int l = 0; l < q; l++) {
                        //indices = indices + GuardarIndices(String.valueOf(i),String.valueOf(j));
                        if(matrizBusqueda[k][l] != matrizPrincipal[i+k][j+l]){
                            encontrada = false;
                            indices = "";
                            break;
                        }


                    }

                    if(!encontrada){
                        break;
                    }

                }

                if(encontrada){
                    System.out.println(indices);
                    return true;
                }
            }

        }
        return false;
    }

   // public static String GuardarIndices(String indiceDeFilas, String indiceDeColumnas){

           // return "[" + indiceDeFilas + "," + indiceDeColumnas + "]";
    //  }
}
