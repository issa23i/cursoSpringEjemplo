package com.isabelpastorlopezcv.entidades;

import com.isabelpastorlopezcv.services.EntidadService;

public class Entidad implements EntidadService {
    private String nombre;
    private int codigo;

    @Override
    public void altaEntidad(Entidad entidad) {
        System.out.println("Entidad dada de alta");
    }

    private void searchEntidad(){
        System.out.println("Entidad encontrada");
    }

    private void updateEntidad(){
        System.out.println("Entidad modificada");
    }

    private void deleteEntidad(){
        System.out.println("Entidad eliminada");
    }
}
