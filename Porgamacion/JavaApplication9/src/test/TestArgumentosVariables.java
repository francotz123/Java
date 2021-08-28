
package test;

public class TestArgumentosVariables {
    
    public static void main(String[] args) {
        imprimirNumeros(5,6);
    }
    
    private static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("i = " + numeros[i]);
        }
    }
}
