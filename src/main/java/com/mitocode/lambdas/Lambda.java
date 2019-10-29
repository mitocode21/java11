package com.mitocode.lambdas;

import java.util.stream.IntStream;

public class Lambda {

    public void probar(String seleccion) {
        // Pares //Impares                
        switch (seleccion) {
        case "PAR":
            IntStream.of(1, 2, 3, 4, 5, 6, 7).filter((var i) -> i % 2 == 0).forEach(System.out::println);
            break;
        case "IMPAR":
            IntStream.of(1, 2, 3, 4, 5, 6, 7).filter((var i) -> i % 2 != 0).forEach(System.out::println);
            break;
        }
    }

    public void sumar() {
        IOperacion operacion = (var x, var y) -> (x + y);
        double resultado = operacion.calcular(2, 2.0);
        System.out.println(resultado);
    }

}