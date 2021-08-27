package calculadora;

public class Principal {

    public static void main(String... argumentos) {
        
        Calculadora calculadora = new Calculadora();
        float resultado = calculadora.suma(2, 1);
        System.out.println("Suma enteros: " + resultado);
        
        double rest = calculadora.suma(2.9, 1.8);
        System.out.println("Suma double: " + rest);
        
        
        resultado = calculadora.suma(2, 1,3,4,5,6);
        System.out.println("Suma multiples parametros: " + resultado);
        
        Integer numero = 2;
        
    }
    
}
