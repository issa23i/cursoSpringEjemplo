package com.isabelpastorlopezcv;

import com.isabelpastorlopezcv.entidades.Alumno;
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

        Alumno pepe = new Alumno("Jose","Canton");
        Alumno pepe2 = new Alumno("Jose","Canton");
        pepe.setEdad(44);

        Alumno andonio = new Alumno("Antonio", "Mujica");
        andonio.setApellido2("Encala");

        System.out.println(andonio.getApellido1());
        System.out.println(andonio.equals(pepe));
        System.out.println(pepe.equals(pepe2));
        pepe2.setEdad(50);
        System.out.println(pepe.equals(pepe2));
        System.out.println(pepe + " " + pepe2);
        System.out.println(pepe.hashCode() + "-" + pepe2.hashCode());
        pepe2.setApellido1("Calatrava");
        System.out.println(pepe.equals(pepe2));
        System.out.println(pepe + " " + pepe2);
        System.out.println(pepe.hashCode() + "-" + pepe2.hashCode());
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
