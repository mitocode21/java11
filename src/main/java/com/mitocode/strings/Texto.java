package com.mitocode.strings;

import java.util.stream.Collectors;

public class Texto {

    public void estaVacio(String texto) {
        System.out.println(texto.isBlank());
    }

    public void repetir(String texto, int cantidad) {
        var repetido = texto.repeat(cantidad);
        System.out.println(repetido);
    }

    public void convertirLista(String texto) {
        System.out.println(texto.lines().collect(Collectors.toList()));
    }

    public void removerEspacios(String texto) {
        // Al inicio y final
        System.out.println(texto.strip());
        // System.out.println(texto.stripLeading());
        // System.out.println(texto.stripTrailing());
        System.out.println(texto.trim());
    }
}