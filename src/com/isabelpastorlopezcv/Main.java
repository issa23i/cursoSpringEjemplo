package com.isabelpastorlopezcv;

import com.isabelpastorlopezcv.entidades.Docente;
import com.isabelpastorlopezcv.entidades.Entidad;
import com.isabelpastorlopezcv.services.EntidadService;
import com.isabelpastorlopezcv.services.EntidadServiceImpl;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        EntidadService service = new EntidadServiceImpl();
        service.altaEntidad(new Entidad());
        Docente docente = null;
        Date fecha;
        // alt enter para importar clases

        extracted("Hola, ¿Cómo estás?");
        // ctrl alt mayusc n para extraer un método

        // refactoriing
        // ctrl w w para seleccionar la frase
        // ctrl alt v reemplaza por una variable
    }

    private static void extracted(String mensaje) {
//        comentar ctrol /
        System.out.println(mensaje);
        // ctrl x elimina una línea
        // ctrl alt p para sacar del método y convertirlo en parámetro
    }

    /*para comentar
            un bloque
            ctrol shift /  */
}
