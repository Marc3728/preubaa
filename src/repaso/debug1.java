package repaso;

import java.util.Scanner;

public class debug1 {
    public static void main(String[] args) {
        int filas=0;
        int columnas=0;
        filas=pedirFilas();
        columnas=pedirColumnas();
        int matriz [][]=new int [filas][columnas];
        rellenarMatriz(matriz);
        mostrarMatriz(matriz);

    }
    public static int pedirFilas(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantas filas va a haber?");
        int a = teclado.nextInt();
        return a;
    }
    public static int pedirColumnas(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantas Columnas va a haber?");
        int a = teclado.nextInt();
        return a;
    }
    public static int darAleatorio(){
        int a=(int)(Math.random()*100);
        return a;
    }
    public static void rellenarMatriz(int vec[][]){
        for(int i=0;i<vec.length;i++){
            for(int j=0;j<vec[0].length;j++){
                vec[i][j]=darAleatorio();
            }
        }
    }
    public static void mostrarMatriz(int vec[][]){
        for(int i=0;i<vec.length;i++){
            for(int j=0;j<vec[0].length;j++){
                System.out.print(vec[i][j]+" ");
            }
            System.out.println();
        }
    }
}
