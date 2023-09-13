package com.isabelpastorlopezcv.entidades;

import com.isabelpastorlopezcv.services.EntidadService;

import java.util.Objects;

public class Entidad implements EntidadService {
    private String nombre;
    private int codigo;

    public Entidad(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public Entidad() {

    }

    @Override
    public String toString() {
        return "Entidad{" +
                "nombre='" + nombre + '\'' +
                ", codigo=" + codigo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entidad)) return false;
        Entidad entidad = (Entidad) o;
        return getCodigo() == entidad.getCodigo() && Objects.equals(getNombre(), entidad.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getCodigo());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

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
