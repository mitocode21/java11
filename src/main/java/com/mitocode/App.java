package com.mitocode;

import com.mitocode.opts.Demo;
import com.mitocode.opts.Persona;

public class App {   

    public static void main(String[] args) {

        Demo d = new Demo();        
        //Persona per = new Persona(1, "MitoCode");
        //Persona per = new Persona();
        Persona per = null;        
        d.estaVacio(per);
        d.estaPresente(per); 
    }
}
