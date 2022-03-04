package repaso;
/**
*@author Marc Ramos
 * @version 1.0
 */
public class ComentaCodigo {
    /**
     * Suma dos numeros
     * @param num1 primer numero
     * @param num2 segundo numero
     * @return suma de dos operandos
     */
    public static int suma(int num1, int num2)
    {
        int res = num1 + num2;
        return res;
    }

    /**
     * genera un numero en un rango
     * @param num1 Limite inferior
     * @param num2 Limite superior
     * @return numero altatorio con rango de los dos numero
     */
    public static int generaAleatorioEntre(int num1, int num2)
    {
        return ((int)Math.floor(Math.random()*(num2-num1)+num1));
    }

    /**
     * Concatena dos palabras
     * @param cad1 primera palabra
     * @param cad2 segunda palabra
     * @return ambas palabras concatenadas
     */
    public static String concatena (String cad1, String cad2)
    {
        String res = cad1 +" "+ cad2;
        return res;
    }

    /**
     * Compara y coje numero mayor entre dos numeros
     * @param num1 numero uno
     * @param num2 numero dos
     * @return numero mayor
     */
    public static int getMayor(int num1, int num2)
    {
        if (num1>num2)
            return num2;
        else
            return num1;
    }

    /**
     * Compara y recoje el numero mayor de un vector
     * @param vector vector donde buscar
     * @return numero mayor
     */
    public static int getMaximo(int vector[])
    {
        int res = vector[0];
        for(int i=0;i<vector.length;i++)
        {
            if(vector[i]>res)
                res = vector[i];
        }
        return res;
    }

    /**
     * Dado un vector y posicion coje el elemento correcpondiente a es posicion
     * @param vector vector de enteros donde buscar
     * @param pos la posicon donde se encuentra el entero
     * @return el elemento de el vector en la posicion dada
     */
    public static int getElemento(int vector[], int pos)
    {
        int res = vector[pos-1];
        return res;
    }

    public static int factorial(int num)
    {
        int res=num;
        for(int cont=(num-1);cont>0;cont--){
            res=res*cont;
        }
        return res;
    }

    public static boolean esPrimo (int numero){

        if (numero<=1){
            return false;
        }
        int cont=0;
        for (int divisor=(int)Math.sqrt(numero);divisor>1;divisor--){
            if (numero%divisor==0){
                cont+=1;
            }
        }
        if (cont>=1){
            return false;
        }else{
            return true;
        }
    }

    public static double areaCirculo(int radio)
    {
        return Math.pow(radio, 2)*Math.PI;
    }

    public static double areaTriangulo(int base, int altura)
    {
        return base*altura/3;
    }

    public static double areaCuadrado(int lado)
    {
        return lado*lado;
    }

    public static String decimalABinario(int num)
    {
        String res="";
        String bit;
        for(int i=num;i>0;i/=2){
            if(i%2==1){
                bit="0";
            }else{
                bit="1";
            }
            res=bit+res;
        }
        return res;
    }
}
