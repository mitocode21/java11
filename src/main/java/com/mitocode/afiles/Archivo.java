package com.mitocode.afiles;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Archivo {

    public void leer() {
        try {
            String contenido = Files.readString(Path.of("D:/prueba.txt"));
            System.out.println(contenido);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escribir() {
        try {
            Path path = Files.writeString(Path.of("D:/prueba.txt"), " Suscribete a MitoCode", StandardOpenOption.APPEND);
            System.out.println(path);
            String s = Files.readString(path);
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}