package calculadora;

public class Calculadora {
    // Sobrecarga de metodos

    // Sumar
    // retornar un numero entero
    public int suma(int numeroA, int numeroB) {
        int resultado = numeroA + numeroB;
        return resultado;
    }

    // Flotantes
    public float suma(float numeroA, float numeroB) {
        return numeroA + numeroB;
    }
    
    // Double
    public double suma(double numeroA, double numeroB) {
        return numeroA + numeroB;
    }
    
    // Multiples parametros
    public int suma(int... numeros) {
        
        int suma = 0;
        
        /*
        for(int indice = 0; indice < numeros.length; indice++){
            suma += numeros[indice];
        }
        */
        // For each
        for(int numero : numeros){
            suma += numero;
        }
        
        
        return suma;        
    }
}
